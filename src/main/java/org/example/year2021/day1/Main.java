package org.example.year2021.day1;

public class Main {

    public static void main(String[] args) {

        String path = "src/main/resources/day1/input.txt";

        System.out.println(PartOne.runPartOne(path, 1));

        System.out.println(PartTwo.runPartTwo(path, 3));
    }
}