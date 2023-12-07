package org.example.year2023.day2;

import java.util.*;
import java.util.stream.Collectors;

public class CubeGameManager {

    public int sumValidGames(String testInput) {

        Map<String, List<String>> gamesCollection = Arrays.stream(testInput.split("\n"))
                .map(entry -> entry.split(":"))
                .collect(Collectors.toMap(
                        entry -> entry[0].trim(),
                        entry -> (Arrays.stream(entry[1].split(";")).map(String::trim).toList())
                ));
//        gamesCollection.keySet().forEach(k -> System.out.println("game" + k));
//        gamesCollection.values().forEach(gam -> gam.forEach(m -> System.out.println("match:" + m)));

        GameValidator validator = new GameValidator();
        gamesCollection.entrySet().stream()
                .filter(entry -> validator.valid(entry.getValue())).collect(Collectors.toList());


        return 0;
    }
}
