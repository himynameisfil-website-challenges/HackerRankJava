package com.hackerrank.java.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResultTest {

    @Test
    public void findDay() {

        assertEquals("WEDNESDAY", Result.findDay(8, 5, 2015));
    }
}