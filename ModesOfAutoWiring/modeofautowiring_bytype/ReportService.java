package com.example.allspring.modeofautowiring_byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService
{
    @Autowired
    @Qualifier("pdf")
    private IReport reportGenerater;

    public void reportGenerater()
    {
        reportGenerater.generateReport();
    }
}
