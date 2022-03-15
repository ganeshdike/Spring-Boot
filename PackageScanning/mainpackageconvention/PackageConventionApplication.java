package com.demo.packageconvention;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.packageconvention","com.demo.anotherpackage","com.demo.thirdPackage"})
public class PackageConventionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PackageConventionApplication.class, args);
    }

}
