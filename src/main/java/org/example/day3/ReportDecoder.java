package org.example.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReportDecoder {

    private final List<String> report;
    private final int colCount;

    public ReportDecoder(List<String> report) {
        this.report = List.copyOf(report);
        this.colCount = getColCount();
    }

    public void decode() {
        if (this.report != null) {

            Stack<List<String>> processedReport = new Stack<>();
            var columnData = new ArrayList<String>();

            for (int i = 0; i < colCount; i++) {
                columnData.clear();
                for (String s : report) {
                    String[] split = s.split("");
                    String encodedParam = split[i];
                    columnData.add(encodedParam);
                }
                processedReport.add(columnData);
            }
//            processedReport.forEach(System.out::println);
            var calculator = new RateCalculator();
            calculator.calculate(processedReport);
        }
    }

    public int getColCount() {
        return report != null ? report.get(0).length() : 0;
    }
}
