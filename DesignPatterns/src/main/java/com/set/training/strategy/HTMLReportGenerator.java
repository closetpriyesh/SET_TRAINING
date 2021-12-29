package com.set.training.strategy;

public class HTMLReportGenerator implements ReportGenerator{
    @Override
    public void generateReport() {
        System.out.println("This is HTML report generator");
    }
}
