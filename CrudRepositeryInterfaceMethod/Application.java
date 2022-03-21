package com.spring;

import com.spring.entity.Student;
import com.spring.repositery.StudentRepositery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
        StudentRepositery studentRepositery=context.getBean(StudentRepositery.class);
        //System.out.println(studentRepositery.getClass().getName());
//       Student student1=new Student(105,"sagar","sagr@gmail.com",28);
//       Student student2=new Student(106,"dipak","dipak@gmail.com",19);
//       Student student3=new Student(107,"sanket","sanket@gmail.com",22);
//       Student student4=new Student(108,"mahesh","mahesh@gmail.com",13);
//
//      Save Method
        /*studentRepositery.save(student1);
        studentRepositery.save(student2);
        studentRepositery.save(student3);
        studentRepositery.save(student4);*/

        //Save All Method
        /*List<Student> studentList= Arrays.asList(student1,student2,student3,student4);
        studentRepositery.saveAll(studentList);*/

        //count Record
        //System.out.println("Count Record : "+ studentRepositery.count());

        //Find By Id
       // System.out.println("Find Id Present or NOt : "+studentRepositery.findById(105) );

        List<Integer> list=Arrays.asList(105,106,127);

        Iterable<Student> students=studentRepositery.findAllById(list);

        for(Student student : students)
        {
            System.out.println(student);
        }


        //ID Exist or Not
        System.out.println("If Record Present ? : "+studentRepositery.existsById(123));


        //Find All Method
    /*   Iterable<Student> students=studentRepositery.findAll();
        for(Student student : students)
        {
            System.out.println(student);
        }   */
        ///System.out.println("************ Record Inserted ***********");
        System.out.println("************ Kya kr Raha Hain Bhai Tu ***********");
    }

}
