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

    public List<List<String>> decode() {
        List<List<String>> processedReport = new ArrayList<>();

        for (int i = 0; i < colCount; i++) {
            var columnData = new ArrayList<String>();
            for (String s : report) {
                String[] split = s.split("");
                String encodedParam = split[i];
                columnData.add(encodedParam);
            }
            processedReport.add(columnData);
        }
        return processedReport;
    }

    private int getColCount() {
        return report != null ? report.get(0).length() : 0;
    }
}
