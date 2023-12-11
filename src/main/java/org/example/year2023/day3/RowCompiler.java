package org.example.year2023.day3;

import java.util.Arrays;
import java.util.List;

public class RowCompiler {

    private final String line;
    private final List<String> rowCharacters;

    public RowCompiler(String line) {
        this.line = line;
        this.rowCharacters = rowSplitInstructionList(line);
    }

    public String getLine() {
        return line;
    }

    public List<String> getRowCharacters() {
        return rowCharacters;
    }

    private List<String> rowSplitInstructionList(String line) {
        return Arrays.stream(line.split("")).toList();
    }
}
