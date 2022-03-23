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

        // Find By Method

        /*Student student=studentRepositery.findByStudentAge(27);
        System.out.println(student);
*/

//        List<Student> students=studentRepositery.findByStudentAgeGreaterThanEqual(26);

        List<Student> students=studentRepositery.findByStudentNameAndStudentAge("sagar",28);

        //List<Student> students=studentRepositery.findAll();
        for(Student std : students)
        {
            System.out.println(std);
        }
        System.out.println("************ Kya kr Raha Hain Bhai Tu ***********");
    }

}
