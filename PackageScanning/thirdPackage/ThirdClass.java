package com.demo.thirdPackage;

import org.springframework.stereotype.Component;

@Component
public class ThirdClass
{
    public ThirdClass()
    {
        System.out.println("********** Third PackageClass : Constructor Dont follow base package Convention **************");
    }
}
