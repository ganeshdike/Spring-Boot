package com.example.allspring.FirstProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo
{
    public Demo()
    {
        System.out.println("***************** Inside Demo : Constructor *********************");
    }
    //Student stud;
    //Dependancy injection using Constructoor
    /* @Autowired
    public Demo(Student student)
    {

        stud=student;
    }
*/
    /*Dependancy injection using Field
    @Autowired
    Student stud;
    */
    //Dependancy Injection Using Setter Method
    Student stud;
    @Autowired
    public void setStud(Student stud)
    {
        this.stud = stud;
    }

    public void getId()
    {
        int result=stud.getId();
        for(int i=2;i<=result;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print("\t"+i*j);
            }
            System.out.println("\n");
        }
    }
}
