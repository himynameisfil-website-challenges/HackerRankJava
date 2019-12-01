package com.hackerrank.java.subdomain.bignumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaBigIntegerTest {

    @Test
    public void add() {
        String expectedValue    =   "1254";
        assertEquals(expectedValue, JavaBigInteger.add("1234", "20"));
    }

    @Test
    public void multiply() {
        String expectedValue    =   "24680";
        assertEquals(expectedValue, JavaBigInteger.multiply("1234", "20"));
    }
}