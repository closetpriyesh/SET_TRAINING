package com.set.training.strategy;

public class Runner {
    public static void main(String[] args) {
        ReportGenerator html = new HTMLReportGenerator();
        ReportGenerator xml = new XMLReportGenerator();
        html.generateReport();
        xml.generateReport();
    }
}
