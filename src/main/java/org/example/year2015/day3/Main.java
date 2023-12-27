package org.example.year2015.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/year2015/day3/inputfile.txt"));

        System.out.println(reader.lines().collect(Collectors.joining(", ")));
//        calculate(reader.readLine());

    }

    public static void calculate(String input) {
        String[] strings = input.split("\n"); // FOR TESTS

    }


    private class House {

        private int visitCount = 1;
        private int x;
        private int y;

        private House(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}