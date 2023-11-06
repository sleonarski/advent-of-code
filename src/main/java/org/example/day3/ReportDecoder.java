package org.example.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReportDecoder {

    public ReportDecoder(String report) {

        int colCount = Arrays.stream(report.split("\n")).findFirst().orElse("").length();

        List<List<String>> columns = new ArrayList<>();

        var columnData = new ArrayList<String>();

        for (int i = 0; i < colCount; i++) {
            columnData.clear();
            Iterator<String> it = Arrays.stream(report.split("\n")).iterator();
            while (it.hasNext()) {
                String[] split = it.next().split("");
                String s = split[i];
                columnData.add(s);
            }
            columns.add(columnData);
        }
        System.out.println(colCount);
    }
}
