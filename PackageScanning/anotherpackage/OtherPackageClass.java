package com.demo.anotherpackage;

import org.springframework.stereotype.Component;

@Component
public class OtherPackageClass
{
    public OtherPackageClass()
    {
        System.out.println("********** OtherPackageClass : Constructor Dont follow base package Convention **************");
    }
}
