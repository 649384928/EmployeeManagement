package com.xinxin.Myspring.mapper;

import com.xinxin.Myspring.pojo.Department;
import com.xinxin.Myspring.pojo.Employee;
import com.xinxin.Myspring.relation.EmployeeAndDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<EmployeeAndDepartment> getemployeelist();
    void addemployee(@Param("employeename") String employeeName, @Param("employeeemail")String employeeemail,@Param("gender") Integer gender, @Param("departmentId")Integer departmentId, @Param("date")Date date);

    EmployeeAndDepartment selectEmployee(@Param("employeeName") String employeeName);

}
