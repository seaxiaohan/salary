package com.ecombine.salary.service;

import com.ecombine.salary.pojo.SalaryDetail;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface SalaryService {

    List<SalaryDetail> findAll();

    boolean batchImport(String fileName, MultipartFile file) throws Exception;

}
