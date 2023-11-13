package org.example.day2;

import static java.util.Collections.emptyList;

import java.util.List;

public class MockData {

    public static final String TEST_PATH = "src/test/resources/day2/test-data.txt";
    public static final List<String> TEST_DATA = List.of("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2");
    public static final List<String> EMPTY = emptyList();
    public static final List<String> ONE_VALUE_LIST = List.of("forward 5");
    public static final List<String> SAME_VALUE_LIST = List.of("forward 5", "forward 5", "forward 5", "forward 5", "forward 5", "forward 5");
    public static final List<String> INVALID_VALUE_LIST = List.of("forward ex", "random value", "245 52 8", "e", " ", "TestV4lU3");
}