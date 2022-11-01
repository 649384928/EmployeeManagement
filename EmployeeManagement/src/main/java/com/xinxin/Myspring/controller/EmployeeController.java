package com.xinxin.Myspring.controller;

import com.xinxin.Myspring.pojo.Department;
import com.xinxin.Myspring.relation.EmployeeAndDepartment;
import com.xinxin.Myspring.service.DepartmentService;
import com.xinxin.Myspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/emp")
    public String employeelist(Model model) {

        List<EmployeeAndDepartment> employees = employeeService.getemployeelist();
        model.addAttribute("emps", employees);
        return "list";
    }

    @RequestMapping("/add")
    public  String addview(Model model){
        List<Department> departments = departmentService.selectDepartment();
        model.addAttribute("departments",departments);
        return "add";
    }

    @RequestMapping("/add1")
    public String addemp(@RequestParam("employeeName") String employeeName, @RequestParam("email") String employeeemail, @RequestParam("gender") Integer gender,  @RequestParam("departmentId") Integer departmentId, @RequestParam("date") java.sql.Date date) {
            employeeService.addemployee(employeeName,employeeemail,gender,departmentId,date);
            return "main";
    }

    @RequestMapping("/main")
    public String returnMain(){
        return "main";
    }

    @RequestMapping("/select")
    public String selectEmployeeView(){
        return "select";
    }

    @RequestMapping("select1")
    public  String selectEmployee(@RequestParam("employeeName") String employeeName,Model model){
        EmployeeAndDepartment employeeAndDepartment=employeeService.selectEmployee(employeeName);
        model.addAttribute("emps",employeeAndDepartment);
        return "list";
    }
}
