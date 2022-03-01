package com.example.allspring.modeofautowiring_byname;

import org.springframework.stereotype.Component;
//in this apporach based on DataType it will identify dependent bean object
/*
-if more than one bean matched with datatype then we will get Ambiguity problem
-to resolve Ambiguity problem we have below two Solution
    1) @Primary
    2) @Qulifier
-whene our beans dosent have any name then we can mark one bean as @Primary so that it will be consider as
    auto-wire candidate..
-whene our beans are having names then we can use @Qulifier Anotation to resolve Ambiguity

*/
@Component("pdf")
public class PDFReport implements IReport
{
    @Override
    public void generateReport()
    {
        System.out.println("*********************** PDF Report Generated *************************");
    }
}
