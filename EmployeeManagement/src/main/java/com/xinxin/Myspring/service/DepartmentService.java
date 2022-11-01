package com.xinxin.Myspring.service;

import com.xinxin.Myspring.pojo.Department;
import org.springframework.stereotype.Service;

import java.util.List;
public interface DepartmentService {
    List<Department> selectDepartment();
}
