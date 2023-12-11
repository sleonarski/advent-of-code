package org.example.year2023.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class EngineSchemaCompiler {
    public int calculate(String testInput) {

        List<String> slicedInput = Arrays.stream(testInput.split("\n")).toList();
        List<RowCompiler> instructionRowsList = slicedInput.stream().map(RowCompiler::new).toList();

        Map<Integer, String> integerCharacterMap = checkEngineParts(instructionRowsList);

        instructionRowsList.stream().forEach(row -> {
            System.out.println();
            row.getRowCharacters().forEach(c -> System.out.print(c));
        });


        return 0;
    }

    private Map<Integer, String> checkEngineParts(List<RowCompiler> instructionRowsList) {
        for (RowCompiler compiler : instructionRowsList) {
            for (String charr : compiler.getRowCharacters()) {
                if (!charr.equals(".")) {
                    // znalezc index of charr, dodac od listy, sprawdzac indexy miedzy rowami
                }
            }
        }

        private Map<Integer, String> checkEngineParts2 (List < RowCompiler > instructionRowsList) {

            Map<Integer, String> map = new HashMap<>();
            for (RowCompiler row : instructionRowsList) {
                List<String> rowCharacters = row.getRowCharacters();
                for (int i = 0; i < rowCharacters.size(); i++) {
                    String v = rowCharacters.get(i);
                    System.out.println(v);
                    if (!v.equals(".")) {
                        map.put(i, v);
                    }
                }
            }
            return map;
        }
    }
