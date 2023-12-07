package org.example.year2023.day2;

import org.example.common.utils.DataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> input = DataReader.readFileAsList("src/main/resources/year2023/day2/input.txt");
        var manager = new GameManager();

        System.out.println(manager.calculateSum(input));
    }
}