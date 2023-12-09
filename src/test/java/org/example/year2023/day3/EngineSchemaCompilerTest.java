package org.example.year2023.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineSchemaCompilerTest {

    private final String TEST_INPUT = """
            467..114..
            ...*......
            ..35..633.
            ......#...
            617*......
            .....+.58.
            ..592.....
            ......755.
            ...$.*....
            .664.598..""";

    @Test
    void shouldSumAllParts() {
        //given
        var compiler = new EngineSchemaCompiler();
        //when
        int result = compiler.calculate(TEST_INPUT);
        //then
        assertEquals(4361, result);
    }

}