package org.example.year2023.day3;

public class PartChunks {

    private final String name;
    private final Integer index;
    private final Integer instructionRow;

    public PartChunks(String name, Integer index, Integer instructionRow) {
        this.name = name;
        this.index = index;
        this.instructionRow = instructionRow;
    }

    public String getName() {
        return name;
    }

    public Integer getIndex() {
        return index;
    }

    public Integer getInstructionRow() {
        return instructionRow;
    }
}
