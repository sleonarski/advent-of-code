package org.example.day3;

import org.example.common.utils.DataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> input = DataReader.readFileAsList("src/main/resources/day3/data.txt");
        //Part one
        var calculator = new RateCalculator();
        RateVault rateVault = calculator.calculate(input);
        int calculatedConsumption = rateVault.gamma() * rateVault.epsilon();
        System.out.println(calculatedConsumption);
    }
}