package com.ecombine.salary.service;

import com.ecombine.salary.common.MyException;
import com.ecombine.salary.dao.SalaryDetailMapper;
import com.ecombine.salary.pojo.SalaryDetail;
import com.ecombine.salary.pojo.SalaryDetailExample;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * @program: salary
 * @description:
 * @author: Mr.Hao
 * @create: 2019-09-29 14:40
 **/
@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryDetailMapper salaryDetailMapper;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public List<SalaryDetail> findAll() {
        SalaryDetailExample salaryDetailExample = new SalaryDetailExample();
        List<SalaryDetail> salaryDetails = salaryDetailMapper.selectByExample(salaryDetailExample);
        return salaryDetails;
    }

    @Override
    public boolean batchImport(String fileName, MultipartFile file) throws Exception {

        boolean notNull = false;

        List<SalaryDetail> salaryDetails = new ArrayList<>();

        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
            throw new MyException("上传文件格式不正确");
        }

        boolean isExcel2003 = true;

        if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
            isExcel2003 = false;
        }

        InputStream is = file.getInputStream();

        Workbook wb = null;

        if (isExcel2003) {
            wb = new HSSFWorkbook(is);
        } else {
            wb = new XSSFWorkbook(is);
        }

        Sheet sheet = wb.getSheetAt(0);
        if(sheet!=null){
            notNull = true;
        }

        SalaryDetail salaryDetail;
        //r = 2 表示从第三行开始循环 如果你的第三行开始是数据
        for (int r = 1; r <= sheet.getLastRowNum(); r++) {

            //通过sheet表单对象得到 行对象

            Row row = sheet.getRow(r);

            if (row == null){
                continue;
            }

            //sheet.getLastRowNum() 的值是 10，所以Excel表中的数据至少是10条；不然报错 NullPointerException

            salaryDetail = new SalaryDetail();

            //循环时，得到每一行的单元格进行判断

            if( row.getCell(0).getCellType() !=1){
                throw new MyException("导入失败(第"+(r+1)+"行,用户名请设为文本格式)");
            }

            //读取表中数据
            String jobno = row.getCell(0).getStringCellValue();
            String name = row.getCell(1).getStringCellValue();
            String year = row.getCell(2).getStringCellValue();
            String departName = row.getCell(3).getStringCellValue();
            String position = row.getCell(4).getStringCellValue();
            String wageDb = row.getCell(5).getStringCellValue();
            String cqgzDb = row.getCell(6).getStringCellValue();
            String jxgzblDb = row.getCell(7).getStringCellValue();
            String yfjxgzDb = row.getCell(8).getStringCellValue();
            String jxxsDb = row.getCell(9).getStringCellValue();
            String sfjxgzDb = row.getCell(10).getStringCellValue();
            String gwgeDb = row.getCell(11).getStringCellValue();
            String jngzDb = row.getCell(12).getStringCellValue();
            String bzgsgzDb = row.getCell(13).getStringCellValue();
            String cegsgzDb = row.getCell(14).getStringCellValue();
            String jbgsbtDb = row.getCell(15).getStringCellValue();
            String zsbtDb = row.getCell(16).getStringCellValue();
            String gwbtDb = row.getCell(17).getStringCellValue();
            String zwbtDb = row.getCell(18).getStringCellValue();
            String gaowbDb = row.getCell(19).getStringCellValue();
            String gxjlDb = row.getCell(20).getStringCellValue();
            String jbfDb = row.getCell(21).getStringCellValue();
            String kqjgzDb = row.getCell(22).getStringCellValue();
            String cfbtDb = row.getCell(23).getStringCellValue();
            String gzbtDb = row.getCell(24).getStringCellValue();
            String yfgzhjDb = row.getCell(25).getStringCellValue();
            String dkbxfDb = row.getCell(26).getStringCellValue();
            String dkgjjDb = row.getCell(27).getStringCellValue();
            String bkshbxDb = row.getCell(28).getStringCellValue();
            String bkgjjDb = row.getCell(29).getStringCellValue();
            String gjjcbDb = row.getCell(30).getStringCellValue();
            String yssdeDb = row.getCell(31).getStringCellValue();
            String kgrsdsDb = row.getCell(32).getStringCellValue();
            String klwsDb = row.getCell(33).getStringCellValue();
            String kgrjkDb = row.getCell(34).getStringCellValue();
            String dkgfDb = row.getCell(35).getStringCellValue();
            String klxDb = row.getCell(36).getStringCellValue();
            String kqtDb = row.getCell(37).getStringCellValue();
            String dkyfbxfDb = row.getCell(38).getStringCellValue();
            String kkhjDb = row.getCell(39).getStringCellValue();
            String sfgzDb = row.getCell(40).getStringCellValue();
            String sjcq = row.getCell(41).getStringCellValue();
            String sjts = row.getCell(42).getStringCellValue();
            String bjts = row.getCell(43).getStringCellValue();
            String cbts = row.getCell(44).getStringCellValue();
            String zwbtts = row.getCell(45).getStringCellValue();
            String jbjsts = row.getCell(46).getStringCellValue();
            String jbylts = row.getCell(47).getStringCellValue();
            String ysjbxss = row.getCell(48).getStringCellValue();
            String des = row.getCell(49).getStringCellValue();
            String maill = row.getCell(50).getStringCellValue();
            String telNo = row.getCell(51).getStringCellValue();

            //完整的循环一次 就组成了一个对象

            salaryDetail.setJobno(jobno);
            salaryDetail.setName(name);
            salaryDetail.setYear(year);
            salaryDetail.setDepartname(departName);
            salaryDetail.setPosition(position);
            salaryDetail.setWagedb(wageDb);
            salaryDetail.setCqgzdb(cqgzDb);
            salaryDetail.setJxgzbldb(jxgzblDb);
            salaryDetail.setYfjxgzdb(yfjxgzDb);
            salaryDetail.setJxxsdb(jxxsDb);
            salaryDetail.setSfjxgzdb(sfjxgzDb);
            salaryDetail.setGwgzdb(gwgeDb);
            salaryDetail.setJngzdb(jngzDb);
            salaryDetail.setBzgsgzdb(bzgsgzDb);
            salaryDetail.setCegsgzdb(cegsgzDb);
            salaryDetail.setJbgsbtdb(jbgsbtDb);
            salaryDetail.setZsbtdb(zsbtDb);
            salaryDetail.setGwbtdb(gwbtDb);
            salaryDetail.setZwbtdb(zwbtDb);
            salaryDetail.setGaowbtdb(gaowbDb);
            salaryDetail.setGxjldb(gxjlDb);
            salaryDetail.setJbfdb(jbfDb);
            salaryDetail.setKqjgzdb(kqjgzDb);
            salaryDetail.setCfbtdb(cfbtDb);
            salaryDetail.setYfgzhjdb(yfgzhjDb);
            salaryDetail.setDkbxfdb(dkbxfDb);
            salaryDetail.setDkgjjdb(dkgjjDb);
            salaryDetail.setBkshbxdb(bkshbxDb);
            salaryDetail.setGzbtdb(gzbtDb);
            salaryDetail.setBkgjjdb(bkgjjDb);
            salaryDetail.setGjjcbdb(gjjcbDb);
            salaryDetail.setYssdedb(yssdeDb);
            salaryDetail.setKgrsdsdb(kgrsdsDb);
            salaryDetail.setKlwsdb(klwsDb);
            salaryDetail.setKgrjkdb(kgrjkDb);
            salaryDetail.setDkgfdb(dkgfDb);
            salaryDetail.setKlxdb(klxDb);
            salaryDetail.setKqtdb(kqtDb);
            salaryDetail.setDkyfbxfdb(dkyfbxfDb);
            salaryDetail.setKkhjdb(kkhjDb);
            salaryDetail.setSfgzdb(sfgzDb);
            salaryDetail.setSjcq(Long.valueOf(sjcq));
            salaryDetail.setSjts(Long.valueOf(sjts));
            salaryDetail.setBjts(Long.valueOf(bjts));
            salaryDetail.setCbts(Long.valueOf(cbts));
            salaryDetail.setZwbtts(Long.valueOf(zwbtts));
            salaryDetail.setJbjsts(Long.valueOf(jbjsts));
            salaryDetail.setJbylts(Long.valueOf(jbylts));
            salaryDetail.setYsjbxss(Long.valueOf(ysjbxss));
            salaryDetail.setDes(des);
            salaryDetail.setMail(maill);
            salaryDetail.setTelno(telNo);

            //添加到集合中

            salaryDetails.add(salaryDetail);
        }
        //循环添加到数据库中
        for (SalaryDetail record : salaryDetails) {
                salaryDetailMapper.insertSelective(record);
        }
        // 查询所有数据获取工号，生成随机数，把工号和随机拼接更新到数据库为短信激活码
        SalaryDetailExample salaryDetailExample = new SalaryDetailExample();
        List<SalaryDetail> salaryDetails1 = salaryDetailMapper.selectByExample(salaryDetailExample);
        for (SalaryDetail detail : salaryDetails1) {
            String jobno = detail.getJobno();
            int v = (int)(Math.random() * 9 + 1 * 1000);
            String s = String.valueOf(v);
            String smsActi = jobno + v;

            salaryDetailMapper.updateSalaryDetail(jobno, smsActi);

            //设置超时时间-可自行调整
            System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
            System.setProperty("sun.net.client.defaultReadTimeout", "10000");
            //初始化ascClient需要的几个参数
            final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
            final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
            //替换成你的AK
            final String accessKeyId = "LTAI4FeWmjmhEc9N4jymRVSc";//你的accessKeyId
            final String accessKeySecret = "56sUyD6zMb2pqgmHQAl8h3zLWxeHJp";//你的accessKeySecret
            //初始化ascClient,暂时不支持多region（请勿修改）
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
            IAcsClient acsClient = new DefaultAcsClient(profile);
            //组装请求对象
            SendSmsRequest request = new SendSmsRequest();
            //使用post提交
            request.setMethod(MethodType.POST);
            //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为00+国际区号+号码，如“0085200000000”
            String telno = detail.getTelno();
            request.setPhoneNumbers(telno);
            //必填:短信签名-可在短信控制台中找到
            request.setSignName("益凯新材料");
            //必填:短信模板-可在短信控制台中找到，发送国际/港澳台消息时，请使用国际/港澳台短信模版
            request.setTemplateCode("SMS_175245457");
            //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
            //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
             //request.setTemplateParam("{\"code\":\"988756\"}");
//            String msgCode = getMsgCode();
            request.setTemplateParam("{\"smsActi\":\"" + smsActi + "\"}");

            //请求失败这里会抛ClientException异常
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
            if (sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
                //请求成功
                System.out.println("=====success====");
            } else {
                System.out.println("=====fail=======");
            }

        }
        return notNull;

    }


}
