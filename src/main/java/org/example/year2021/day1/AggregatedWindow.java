package org.example.year2021.day1;

import java.util.LinkedList;

public class AggregatedWindow {

    private int count;
    private final int windowSize;
    private final LinkedList<Integer> structureList;

    public AggregatedWindow(int windowSize) {
        this.windowSize = windowSize;
        this.structureList = new LinkedList<>();
    }

    public void nextNumber(int number){
        if (structureList.size() < windowSize) {
            structureList.add(number);
        } else {
            Integer beforeSum = structureList.stream().reduce(0, Integer::sum);
            structureList.removeFirst();
            structureList.add(number);
            Integer afterSum = structureList.stream().reduce(0, Integer::sum);
            count += afterSum > beforeSum ? 1 : 0;
        }
    }

    public int getCount() {
        return count;
    }
}