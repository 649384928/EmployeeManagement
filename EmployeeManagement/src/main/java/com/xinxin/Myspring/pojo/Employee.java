package com.xinxin.Myspring.pojo;


public class Employee {

  private long id;
  private String employeeName;
  private String email;
  private long gender;
  private long departmentId;
  private java.sql.Date date;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", employeeName='" + employeeName + '\'' +
            ", email='" + email + '\'' +
            ", gender=" + gender +
            ", departmentId=" + departmentId +
            ", date=" + date +
            '}';
  }
}
