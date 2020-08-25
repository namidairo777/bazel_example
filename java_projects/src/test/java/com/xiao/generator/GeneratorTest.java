package com.xiao.generator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GeneratorTest {
    @Test
    public void testGetMessage() {
        final Generator generator = new Generator();
        assertEquals("Hello world", generator.getMessage());
    }
}
