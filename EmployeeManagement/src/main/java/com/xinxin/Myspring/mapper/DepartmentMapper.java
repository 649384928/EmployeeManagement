package com.xinxin.Myspring.mapper;

import com.xinxin.Myspring.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> selectDepartment();
}
