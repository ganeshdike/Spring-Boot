package com.example.configurationandbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    public AppConfig()
    {
        System.out.println("************* AppConfig class : Constructor **************");
    }
    @Bean
    public Car getCarInstance()
    {
        Car car=new Car();
        return car;
    }
}
