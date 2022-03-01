package com.example.allspring.modeofautowiring_byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService
{
    @Autowired
    private IReport reportGenerater;

    public void reportGenerater()
    {
        reportGenerater.generateReport();
    }
}
