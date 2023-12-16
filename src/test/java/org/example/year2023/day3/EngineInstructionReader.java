package org.example.year2023.day3;

import java.util.ArrayList;
import java.util.List;

public class EngineInstructionReader {

    private final String instruction;

    public EngineInstructionReader(String instruction) {
        this.instruction = instruction;
    }

    public int readInstruction() {
        String[] splitInstruction = instruction.split("\n");

        List<List<Part>> parts = getParts(splitInstruction);
//        List<List<Part>> validParts = valid(parts);
//        getIndexesOfParts(splitInstruction);

        return 0;
    }

    private List<List<Part>> valid(List<List<Part>> parts) {
        List<List<String>> validParts = new ArrayList<>();
        for (int i = 1; i < parts.size(); i++) {
            List<Part> partsRow = parts.get(i);
            List<String> validPartsRow = new ArrayList<>();
            for (int j = 0; j < partsRow.size(); j++) {
                String part = partsRow.get(j).getName();
                if (isConnection(part, parts.get(i - 1))) {
                    validPartsRow.add(part);
                }
            }
        }

        return null;
    }

    private boolean isConnection(String part, List<Part> strings) {
return true;
    }

    private List<List<Part>> getParts(String[] splitInstruction) {

        List<List<Part>> partsList = new ArrayList<>();
        for (String row : splitInstruction) {
            String[] instructionRow = row.split("");

            List<Part> partsInRow = new ArrayList<>();
            List<Integer> partIndexes = new ArrayList<>();

            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < instructionRow.length; j++) {

                String currentSymbol = instructionRow[j];

                if (!currentSymbol.equals(".")) {
                    builder.append(currentSymbol);
                    partIndexes.add(j);
                } else if (j > 0 && !instructionRow[j - 1].equals(".")) {
                    partsInRow.add(new Part(builder.toString(), partIndexes));
                    builder = new StringBuilder();
                    partIndexes = new ArrayList<>();
                }
            }
            partsList.add(partsInRow);
        }
        return partsList;
    }
}
