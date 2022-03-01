package com.example.allspring;

import com.example.allspring.FirstProgram.Demo;
import com.example.allspring.FirstProgram.Student;
import com.example.allspring.modeofautowiring_byname.ReportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AllSpringApplication {

    public static void main(String[] args)
    {
       ConfigurableApplicationContext context= SpringApplication.run(AllSpringApplication.class, args);
        ReportService object=context.getBean(ReportService.class);
        object.reportGenerater();
    }
}
