package com.ecombine.salary.controller;

import com.ecombine.salary.pojo.SalaryDetail;
import com.ecombine.salary.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @program: salary
 * @description:
 * @author: Mr.Hao
 * @create: 2019-09-29 14:40
 **/
@Controller
public class SalaryController {

    @Autowired
    private SalaryService salaryService;
    @Autowired
    private JavaMailSender javaMailSender;
    @RequestMapping("/index")
    public String showUser(Model model) {
        return "index";
    }

    @RequestMapping(value = "/import")
    public String exImport(@RequestParam(value = "filename")MultipartFile file, HttpSession session) {

        boolean a = false;

        String fileName = file.getOriginalFilename();

        try {
            a = salaryService.batchImport(fileName, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //获取用户邮箱
        List<SalaryDetail> all = salaryService.findAll();
        for (SalaryDetail salaryDetail : all) {
            SimpleMailMessage message = new SimpleMailMessage();
            //标题内容
            message.setSubject("工资条");
            //发件人
            message.setFrom("1358846326@qq.com");
            //收件人
            String email1 = salaryDetail.getMail();
            message.setTo(email1);
            //发送时间
            message.setSentDate(new Date());
            //邮件正文内容
            message.setText("整合邮件正式内容");
            //发送
            javaMailSender.send(message);
        }
        return "redirect:index";

    }


}
