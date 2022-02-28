/*
Dependancy Injection How many type of inject the object
1.Using constructor
2.using setter meythod
3.Field Injection
*/

package com.example.allspring.FirstProgram;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Student
{
    public int id;
    public Student()
    {
        System.out.println("**************** Student : Constructor Created *****************");
    }
    public int getId()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Limit : ");
        id=scanner.nextInt();
        return id;
    }
}
