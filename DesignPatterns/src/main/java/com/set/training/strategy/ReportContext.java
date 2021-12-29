package com.set.training.strategy;

public class ReportContext {
    private ReportGenerator reportGenerator;

    public ReportContext(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        this.reportGenerator.generateReport();
    }
}
