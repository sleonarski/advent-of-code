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

        List<Map<String, List<Integer>>> result = slicedInput.stream().map(this::getParts).toList();

        List<Map<String, List<Integer>>> validPArts = getValidParts(result);
        System.out.println(result);
        return 0;
    }

    private List<Map<String, List<Integer>>> getValidParts(List<Map<String, List<Integer>>> result) {

        for (int i = 1; i < result.size(); i++) {
           List<List<Integer>> partsIndex = result.get(0).values().stream().toList();
           //ToDo - try flatmap to get indexes, next equals with next row and get conectet

            System.out.println(true);
        }
        return null;
    }

    private Map<String, List<Integer>> getParts(String row) {
        List<String> mappedRow = Arrays.stream(row.split("")).toList();
        String result = "";
        Map<String, List<Integer>> parts = new HashMap<>();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < mappedRow.size(); i++) {
            String current = mappedRow.get(i);
            if (!current.equals(".")) {
                result += current;
                indexes.add(i);
            } else if (i > 0 && !mappedRow.get(i - 1).equals(".")) {
                parts.put(result,indexes);
                result = "";
                indexes = new ArrayList<>();
            }
        }

        List<String> list = Arrays.stream(result.split(" ")).toList();

        return parts;
    }
}