package com.demo.packageconvention.secondpackage;

import org.springframework.stereotype.Component;

@Component
public class SecondClass
{
    public SecondClass()
    {
        System.out.println("******************** Second Class : Costructor Follow Base package Convention***************");
    }
}
