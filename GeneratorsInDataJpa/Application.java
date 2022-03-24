package com.spring;

import com.spring.entity.Employee;
import com.spring.entity.EmployeeRepositery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
        EmployeeRepositery employeeRepositery=context.getBean(EmployeeRepositery.class);

        //...Create Table and Insert Record and also one property in .property file "spring.jpa.hibernate.ddl-auto=update"
        //... this propert create tabele autometically

        //...one MOre Employee class Generators also add it is create table hibernate_sequence table and increment by 1
        //... it is used primary key in the table

        /*Employee employee=new Employee("Sarthak",55000.00);
        employeeRepositery.save(employee);
*/
        //...update Record
        employeeRepositery.save(new Employee(3,"ganesh",55000.00));

        List <Employee> employees=employeeRepositery.findAll();

        for(Employee emp : employees)
        {
            System.out.println(emp);
        }

        System.out.println("************ Kya kr Raha Hain Bhai Tu ***********");
    }

}
