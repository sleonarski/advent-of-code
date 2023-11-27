package org.example.year2021.day3;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LifeSupportCalculator implements Calculator{

    @Override
    public int calculate(List<String> input) {

        var decoder = new ReportDecoder(input);
        List<List<String>> decode = decoder.decode();

        List<Map<Integer, String>> list1 = decode.stream().map(list -> IntStream.range(0, list.size()).boxed().collect(Collectors.toMap(Function.identity(), list::get))).toList();
        System.out.println(list1);

        return 0;
    }
}
