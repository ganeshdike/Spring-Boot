package com.spring;

import com.spring.entity.Student;
import com.spring.repositery.StudentRepositery;
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
        StudentRepositery studentRepositery=context.getBean(StudentRepositery.class);

//        List<Student> ls=studentRepositery.findAll();
          List<Student> ls=studentRepositery.findAll(Sort.by("studentAge").ascending());


        //    Query By Example
/*

        Student student=new Student();
        student.setStudentId(107);
         List <Student> ls =studentRepositery.findAll(Example.of(student));
*/


/*
        //PageNation
        int pageNum=2;
        Page <Student> page=studentRepositery.findAll(PageRequest.of(pageNum-1,3));
        List<Student> ls=page.getContent();
*/

        for(Student student1 : ls)
        {
            System.out.println(student1);
        }
        System.out.println("************ Kya kr Raha Hain Bhai Tu ***********");
    }

}
