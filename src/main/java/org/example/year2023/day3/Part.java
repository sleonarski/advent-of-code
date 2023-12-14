package org.example.year2023.day3;

import java.util.List;

public class Part {

    private final String name;
    private final List<Integer> indexes;

    public Part(String name, List<Integer> indexes) {
        this.name = name;
        this.indexes = indexes;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getIndexes() {
        return indexes;
    }
}
