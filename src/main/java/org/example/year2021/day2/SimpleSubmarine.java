package org.example.year2021.day2;

import java.util.List;

public class SimpleSubmarine implements Submarine {

    private int forwardValue;
    private int depthValue;
    private final int sumValue;

    public SimpleSubmarine(List<Command> commands) {
        this.forwardValue = 0;
        this.depthValue = 0;
        this.sumValue = calculate(commands);
    }

    public SimpleSubmarine(List<Command> commands, boolean enableAim) {
        this.forwardValue = 0;
        this.depthValue = 0;
        if (enableAim) {
            this.sumValue = precisionCalculate(commands);
        } else {
            this.sumValue = calculate(commands);
        }
    }

    private int precisionCalculate(List<Command> commands) {
        int aim = 0;
        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward" -> {
                    forwardValue += command.getValue();
                    depthValue += aim * command.getValue();
                }
                case "up" -> aim -= command.getValue();
                case "down" -> aim += command.getValue();
                default -> System.out.println("unknown instruction: " + command.getDirection());
            }
        }
        return forwardValue * depthValue;
    }

    private int calculate(List<Command> commands) {

        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward" -> forwardValue += command.getValue();
                case "up" -> depthValue -= command.getValue();
                case "down" -> depthValue += command.getValue();
                default -> System.out.println("unknown instruction: " + command.getDirection());
            }
        }
        return forwardValue * depthValue;
    }

    public int getSumValue() {
        return sumValue;
    }

    @Override
    public void run() {

    }
}