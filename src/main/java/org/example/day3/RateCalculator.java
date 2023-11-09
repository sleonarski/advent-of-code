package org.example.day3;

import static org.example.day3.RateType.*;

import java.util.List;
import java.util.stream.Collectors;

public class RateCalculator {

    public int calculate(List<String> report) {
        var decoder = new ReportDecoder(report);
        List<List<String>> decodedReport = decoder.decode();

        String gammaBinaryNum = getRateFromReport(decodedReport, GAMMA);
        String epsilonBinaryNum = getRateFromReport(decodedReport, EPSILON);

        var binaryConverter = new BinaryToDecimalConverter();

        return binaryConverter.convert(gammaBinaryNum) * binaryConverter.convert(epsilonBinaryNum);
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
