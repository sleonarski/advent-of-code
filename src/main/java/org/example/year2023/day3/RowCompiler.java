package org.example.year2023.day3;

public class RowCompiler {

    private final String line;
    private final int blindCharCounter;
    public RowCompiler(String line) {
        this.line = line;
        this.blindCharCounter = line != null ? line.replaceAll("(.\\.+)", "").length() : 0;
    }

    public String getLine() {
        return line;
    }

    public int getBlindCharCounter() {
        return blindCharCounter;
    }
}
