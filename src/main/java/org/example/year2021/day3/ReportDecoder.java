package org.example.year2021.day3;

import java.util.ArrayList;
import java.util.List;

public class ReportDecoder {

    private final List<String> report;
    private final int colCount;

    public ReportDecoder(List<String> report) {
        if (report != null) {
            this.report = List.copyOf(report);
            this.colCount = getColCount();
        } else {
            throw new IllegalArgumentException("Cannot create ReportDecoder when report is null");
        }
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
        if (report != null && !report.isEmpty()) {
            return report.get(0).length();
        } else {
            throw new IllegalArgumentException("Report list is null or empty");
        }
    }
}
