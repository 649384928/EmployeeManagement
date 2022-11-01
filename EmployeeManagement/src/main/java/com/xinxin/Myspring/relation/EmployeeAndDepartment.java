package com.xinxin.Myspring.relation;

import java.sql.Date;

public class EmployeeAndDepartment {

    private Integer id;
    private String employeeName;
    private String email;
    private Integer gender;
    private String departmentName;
    private java.sql.Date date;

    public EmployeeAndDepartment() {
    }

    public EmployeeAndDepartment(Integer id, String employeeName, String email, Integer gender, String departmentName, Date date) {
        this.id = id;
        this.employeeName = employeeName;
        this.email = email;
        this.gender = gender;
        this.departmentName = departmentName;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "EmployeeAndDepartment{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", departmentName='" + departmentName + '\'' +
                ", date=" + date +
                '}';
    }
}
