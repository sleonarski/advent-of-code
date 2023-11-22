package org.example.year2021.day3;

import static java.util.Map.*;
import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static org.example.year2021.day3.RateType.EPSILON;
import static org.example.year2021.day3.RateType.GAMMA;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class RateCalculator {

    public int calculateGammaEpsilonRate(List<String> report) {

        var decoder = new ReportDecoder(report);
        List<List<String>> decodedReport = decoder.decode();
        List<Map<String, Long>> mappedReport = mapReport(decodedReport);

        String gamma = getBinaryValue(mappedReport, GAMMA);
        String epsilon = getBinaryValue(mappedReport, EPSILON);

        var binaryConverter = new BinaryToDecimalConverter();

        return binaryConverter.convert(gamma) * binaryConverter.convert(epsilon);
    }

    private static List<Map<String, Long>> mapReport(List<List<String>> decodedReport) {
        return decodedReport.stream()
                .map(list -> list.stream()
                        .collect(groupingBy(identity(), counting())))
                .toList();
    }

    private String getBinaryValue(List<Map<String, Long>> mappedReport, RateType rateType) {

        return mappedReport.stream().map(map -> mapToBinary(map, rateType)).collect(joining(""));
    }

    private String mapToBinary(Map<String, Long> map, RateType rateType) {
        Stream<Entry<String, Long>> streamOfMap = map.entrySet().stream();
        if (rateType.equals(GAMMA)) {
            return streamOfMap.max(
                            Entry.comparingByValue())
                    .map(Entry::getKey)
                    .orElse("1");
        } else {
            return streamOfMap.min(
                            Entry.comparingByValue())
                    .map(Entry::getKey)
                    .orElse("1");
        }
    }
}
