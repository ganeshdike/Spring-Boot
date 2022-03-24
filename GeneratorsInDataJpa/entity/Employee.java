package com.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE_DTLS")
public class Employee
{
    @Id
    @GeneratedValue
    @Column(name = "EMP_ID")
    private Integer empId;

    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "SALARY")
    private Double salary;

    public Employee()
    {
    }



    public Employee(String empName, Double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    public Employee(Integer empId, String empName, Double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
