package org.example.year2023.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EngineSchemaCompiler {
    public int calculate(String testInput) {

        List<String> slicedInput = Arrays.stream(testInput.split("\n")).toList();
        List<RowCompiler> list = slicedInput.stream().map(line -> new RowCompiler(line)).collect(Collectors.toList());

        list.stream().forEach(s -> System.out.println(s.getBlindCharCounter()));
        return 0;
    }
}
