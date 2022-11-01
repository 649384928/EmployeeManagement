package com.xinxin.Myspring.service;

import com.xinxin.Myspring.pojo.Department;
import com.xinxin.Myspring.pojo.Employee;
import com.xinxin.Myspring.relation.EmployeeAndDepartment;

import java.sql.Date;
import java.util.List;


public interface EmployeeService {

    List<EmployeeAndDepartment> getemployeelist();

    void addemployee(String employeeName, String employeeemail, Integer gender, Integer departmentId, Date date);


    EmployeeAndDepartment selectEmployee(String employeeName);
}
