package org.example.year2023.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartsMergerTest {

    private final String TEST_INPUT = "467..114..";

    @Test
    void shouldMergeValidParts() {
        //given
        EngineSchemaCompiler compiler = new EngineSchemaCompiler();
        //when
        int calculate = compiler.calculate(TEST_INPUT);

        //then
    }

}