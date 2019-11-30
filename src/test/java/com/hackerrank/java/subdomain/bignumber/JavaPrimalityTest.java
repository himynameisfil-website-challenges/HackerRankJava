package com.hackerrank.java.subdomain.bignumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaPrimalityTest {

    @Test
    public void determinePrimeness() {
        String expectedResult   =   "prime";

        assertEquals(expectedResult, JavaPrimality.determinePrimeness("13"));
    }
}