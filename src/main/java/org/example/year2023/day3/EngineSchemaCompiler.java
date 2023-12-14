package org.example.year2023.day3;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class EngineSchemaCompiler {

    public int calculate(String testInput) {

        List<String> slicedInput = Arrays.stream(testInput.split("\n")).toList();

        List<List<String>> result = slicedInput.stream().map(row -> getParts(row)).toList();

        System.out.println(result);
        return 0;
    }

    private List<String> getParts(String row) {
        List<String> mappedRow = Arrays.stream(row.split("")).toList();
        String result = "";
        for (int i = 0; i < mappedRow.size(); i++) {
            String current = mappedRow.get(i);
            if (!current.equals(".")) {
                result += current;
            } else if (i > 0 && !mappedRow.get(i - 1).equals(".")) {
                result += " ";
            }
        }
        return Arrays.stream(result.split(" ")).toList();
    }
}