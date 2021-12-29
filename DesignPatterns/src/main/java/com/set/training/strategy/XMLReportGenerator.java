package com.set.training.strategy;

public class XMLReportGenerator implements ReportGenerator{
    @Override
    public void generateReport() {
        System.out.println("This is XML report generator");
    }
}
