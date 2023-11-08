package org.example.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RateCalculator {

    public RateVault calculate(List<String> report) {
        var decoder = new ReportDecoder(report);
        List<List<String>> decodedReport = decoder.decode();

        String gammaBinaryNum = decodedReport.stream().map(RateCalculator::getBinaryNumber).collect(Collectors.joining(""));
        String epsilonBinaryNum = getEpsilonBinaryNum(gammaBinaryNum);

        var binaryMapper = new BinaryToDecimalMapper();

        return new RateVault(binaryMapper.map(gammaBinaryNum), binaryMapper.map(epsilonBinaryNum));
    }

    private String getEpsilonBinaryNum(String gammaBinaryNum) {
        return Arrays.stream(gammaBinaryNum.split("")).map(binary -> binary.equals("1") ? "0" : "1").collect(Collectors.joining(""));
    }

    private static String getBinaryNumber(List<String> binaryNumList) {
        long countOnes = binaryNumList.stream().filter(n -> n.equals("1")).count();
        long countZeros = binaryNumList.stream().filter(n -> n.equals("0")).count();

        return countOnes > countZeros ? "1" : "0";
    }
}
