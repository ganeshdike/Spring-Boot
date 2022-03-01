package com.example.allspring.modeofautowiring_byname;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//2nd  way
@Component("excel")
//1st way by type  @Primary
public class ExcelReport implements IReport
{
    @Override
    public void generateReport()
    {
        System.out.println("********************* Excel Report generated ****************");
    }
}
