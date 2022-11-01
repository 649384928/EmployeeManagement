package com.xinxin.Myspring.service.impl;

import com.xinxin.Myspring.mapper.EmployeeMapper;
import com.xinxin.Myspring.pojo.Department;
import com.xinxin.Myspring.pojo.Employee;
import com.xinxin.Myspring.relation.EmployeeAndDepartment;
import com.xinxin.Myspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeAndDepartment> getemployeelist() {
        return employeeMapper.getemployeelist();
    }

    @Override
    public void addemployee(String employeeName, String employeeemail, Integer gender, Integer departmentId ,Date date) {
        employeeMapper.addemployee(employeeName,employeeemail,gender,departmentId,date);
    }

    @Override
    public  EmployeeAndDepartment selectEmployee(String employeeName) {
        return employeeMapper.selectEmployee(employeeName);
    }
}
