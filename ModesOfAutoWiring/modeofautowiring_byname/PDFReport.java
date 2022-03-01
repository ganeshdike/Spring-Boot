package com.example.allspring.modeofautowiring_byname;

import org.springframework.stereotype.Component;
//in this apporach based on vairable name it will identify dependent bean object
/*
in this above example,in ReportService class dependent bean variable name matched with PdfReport Bean
name hence IOC container injected PDFReport bean into Report Service bean.
*/
@Component("reportGenerater")
public class PDFReport implements IReport
{
    @Override
    public void generateReport()
    {
        System.out.println("*********************** PDF Report Generated *************************");
    }
}
