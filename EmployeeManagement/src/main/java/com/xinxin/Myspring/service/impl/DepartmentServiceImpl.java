package com.xinxin.Myspring.service.impl;

import com.xinxin.Myspring.mapper.DepartmentMapper;
import com.xinxin.Myspring.pojo.Department;
import com.xinxin.Myspring.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> selectDepartment() {
        return departmentMapper.selectDepartment();
    }
}
