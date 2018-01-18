package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaserTest {

    @Test
    public void exampleTest() {
        assertEquals("thisIsMyString",CamelCaser.camelCase("this is my input"));
    }
}