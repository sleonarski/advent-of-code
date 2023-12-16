package org.example.year2023.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PartsMerger {

    public List<Part> connectPartsChunks(List<PartChunks> partChunks) {
        List<Part> parts = new ArrayList<>();
        List<String> partsNames = new ArrayList<>();
//        List<Integer> indexes = new ArrayList<>()
        StringBuilder mergedName = new StringBuilder();
            Iterator<PartChunks> nextChunk = partChunks.iterator();

        for (int i = 0; i <= partChunks.size(); i++) {
            PartChunks actualChunk = partChunks.get(i);
            mergedName.append(actualChunk.getName());
            if (actualChunk.getIndex() + 1 != partChunks.get(i + 1).getIndex()) {
                partsNames.add(mergedName.toString());
                mergedName = new StringBuilder();
            }
        }
        partsNames.add(mergedName.toString());

        mergedName.toString();
        return null;
    }
}