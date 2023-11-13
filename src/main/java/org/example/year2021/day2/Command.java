package org.example.year2021.day2;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Command {

    private final String direction;
    private final int value;
    private static final Pattern COMMAND_PATTERN = Pattern.compile("(\\w+)\\s(\\d)");

    private Command (String direction, int value) {
        this.direction = direction;
        this.value = value;
    }

    public static Command validInput(String input) {
        Matcher matcher = COMMAND_PATTERN.matcher(input);

        if (matcher.matches()) {
            return new Command(matcher.group(1), Integer.parseInt(matcher.group(2)));
        }else throw new IllegalArgumentException("invalid input: " + input);
    }

    public static List<Command> parse(List<String> dataList) {
        return dataList.stream().map(Command::validInput).toList();
    }

    public String getDirection() {
        return direction;
    }

    public int getValue() {
        return value;
    }
}
