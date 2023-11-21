package org.example.year2021.day3;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static org.example.year2021.day3.RateType.EPSILON;
import static org.example.year2021.day3.RateType.GAMMA;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RateCalculator {

    public int calculate(List<String> report) {
        var decoder = new ReportDecoder(report);
        List<List<String>> decodedReport = decoder.decode();

        calculateGammaEpsilonRate(decodedReport);

        String gammaBinaryNum = getRateFromReport(decodedReport, GAMMA);
        String epsilonBinaryNum = getRateFromReport(decodedReport, EPSILON);

        var binaryConverter = new BinaryToDecimalConverter();

        return binaryConverter.convert(gammaBinaryNum) * binaryConverter.convert(epsilonBinaryNum);
    }

    private int calculateGammaEpsilonRate(List<List<String>> decodedReport) {

        List<Map<String, Long>> collect1 = decodedReport.stream()
                .map(list -> list.stream()
                        .collect(Collectors.groupingBy(Function.identity(), counting())))
                .toList();



        System.out.println(collect1);

        return 0;
    }

    private String getRateFromReport(List<List<String>> decodedReport, RateType rateType) {
        return decodedReport.stream().map(d -> getBinaryNumber(d, rateType)).collect(Collectors.joining(""));
    }

    private static String getBinaryNumber(List<String> binaryNumList, RateType rateType) {
        long countOnes = binaryNumList.stream().filter(n -> n.equals("1")).count();
        long countZeros = binaryNumList.stream().filter(n -> n.equals("0")).count();

        if (rateType.equals(GAMMA)) {
            return countOnes > countZeros ? "1" : "0";
        } else {
            return countOnes > countZeros ? "0" : "1";
        }
    }
}
