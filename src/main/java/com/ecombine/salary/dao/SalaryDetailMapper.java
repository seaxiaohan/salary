package com.ecombine.salary.dao;

import com.ecombine.salary.pojo.SalaryDetail;
import com.ecombine.salary.pojo.SalaryDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SalaryDetailMapper {
    long countByExample(SalaryDetailExample example);

    int deleteByExample(SalaryDetailExample example);

    int deleteByPrimaryKey(String jobno);

    int insert(SalaryDetail record);

    int insertSelective(SalaryDetail record);

    List<SalaryDetail> selectByExample(SalaryDetailExample example);

    SalaryDetail selectByPrimaryKey(String jobno);

    int updateByExampleSelective(@Param("record") SalaryDetail record, @Param("example") SalaryDetailExample example);

    int updateByExample(@Param("record") SalaryDetail record, @Param("example") SalaryDetailExample example);

    int updateByPrimaryKeySelective(SalaryDetail record);

    int updateByPrimaryKey(SalaryDetail record);

    int updateSalaryDetail(@Param("jobno")String jobno,@Param("smsActi")String smsActi);
}