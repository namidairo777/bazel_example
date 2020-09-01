package com.xiao.generatorjunit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.xiao.generator.Generator;

public class GeneratorJunit4Test {
    final Generator target = new Generator();

    @Test
    public void testGetMessage() {
        assertEquals("Hello world", target.getMessage());
    }
}
