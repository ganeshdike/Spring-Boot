package com.spring;

import com.spring.entity.Student;
import com.spring.repositery.StudentRepositery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
        StudentRepositery studentRepositery=context.getBean(StudentRepositery.class);
        //System.out.println(studentRepositery.getClass().getName());
        Student student=new Student(101,"ganesh","abc@gmail.com",24);
        studentRepositery.save(student);
        System.out.println("************ Record Inserted ***********");
        System.out.println("************ Kya kr Raha Hain Bhai Tu ***********");
    }

}
