package org.example.year2015.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/year2015/day3/inputfileProd.txt"));
//        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/year2015/day3/inputfile.txt"));

        var directionsMap = Map.of(
                "<", new Coordinates(-1, 0),
                ">", new Coordinates(1, 0),
                "^", new Coordinates(0, 1),
                "v", new Coordinates(0, -1));

        String readinput = reader.readLine();
        reader.close();
        List<House> houses = new ArrayList<>();
        List<House> updatedHouse = new ArrayList<>();
        houses.add(new House(new Coordinates(0, 0)));

        List<String> inputList = Arrays.stream(readinput.split("")).toList();
        List<String> santaList = buildEvenList(inputList);
        List<String> roboSantalist = buildOddList(inputList);

        updatedHouse = getHousesFromPath(santaList, directionsMap, updatedHouse, houses);
        updatedHouse = getHousesFromPath(roboSantalist, directionsMap, updatedHouse, houses);
        long answer = updatedHouse.stream().filter(house -> house.visitCount >= 1).count();
        System.out.println(answer);
    }

    private static List<House> getHousesFromPath(List<String> housesPath, Map<String, Coordinates> directionsMap,
            List<House> updatedHouse, List<House> houses) {
        Coordinates startingPosition = new Coordinates(0, 0);
        for (String direction : housesPath) {
            if (directionsMap.containsKey(direction)) {
                startingPosition.update(directionsMap.get(direction));
                updatedHouse = updateHouses(houses, startingPosition);
            }
        }
        return updatedHouse;
    }

    private static List<House> updateHouses(List<House> houses, Coordinates startingPosition) {
        if (houses.isEmpty()) {
            houses.add(new House(new Coordinates(startingPosition.x, startingPosition.y)));
            return houses;
        }
        for (House house : houses) {
            if (startingPosition.equals(house.coordinates)) {
                house.visitCount++;
                return houses;
            }
        }
        houses.add(new House(new Coordinates(startingPosition.x, startingPosition.y)));
        return houses;
    }

    private static class House {

        private int visitCount = 1;
        private final Coordinates coordinates;

        private House(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        @Override
        public String toString() {
            return "House{" +
                    "visitCount=" + visitCount +
                    ", coordinates=" + coordinates +
                    '}';
        }
    }

    private static class Coordinates {

        private int x;
        private int y;

        private Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void update(Coordinates coordinates) {
            this.x += coordinates.x;
            this.y += coordinates.y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Coordinates that = (Coordinates) o;
            return x == that.x && y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Coordinates{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static List<String> buildOddList(List<String> input) {
        ArrayList<String> output = new ArrayList<>();
//        return buildList(input, 0, output, i -> i % 2 != 0);
        return IntStream.range(0, input.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(input::get)
                .toList();
    }

    public static List<String> buildEvenList(List<String> input) {
        ArrayList<String> output = new ArrayList<>();
//        return buildList(input, 0, output, i -> i % 2 == 0);
        return IntStream.range(0, input.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(input::get)
                .toList();
    }

    private static ArrayList<String> buildList(List<String> input, Integer index, ArrayList<String> output, Predicate<Integer> predicate) {

        if (index == input.size()) {
            return output;
        }
        if (predicate.test(index)) { // || index == 0
            output.add(input.get(index));
        }
        return buildList(input, index + 1, output, predicate);
    }
}