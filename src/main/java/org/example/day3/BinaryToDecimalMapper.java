package org.example.day3;

public class BinaryToDecimalMapper {

    public int map(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }
}