package org.example.day3;

import java.util.List;
import java.util.stream.Collectors;

public class RateCalculator {


    public RateVault calculate(List<List<String>> processedReport) {
        System.out.println(calculateReport(processedReport));
        return new RateVault();
    }

    private String calculateReport(List<List<String>> processedReport) {
        String digitNum = processedReport.stream().map(RateCalculator::getDigit).collect(Collectors.joining(""));

//        var valut = new RateVault();
        return digitNum;
    }

    private static String getDigit(List<String> binaryNumList) {
        long countOnes = binaryNumList.stream().filter(n -> n.equals("1")).count();
        long countZeros = binaryNumList.stream().filter(n -> n.equals("0")).count();

        return countOnes > countZeros ? "1" : "0";
    }
}
