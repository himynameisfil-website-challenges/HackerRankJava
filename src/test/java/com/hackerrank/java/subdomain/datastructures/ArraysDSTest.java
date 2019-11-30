package com.hackerrank.java.subdomain.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysDSTest {

    @Test
    public void reverseArray_Example_1() {
        int[] input = new int[]{1,4,3,2};
        int[] expectedOutput = new int[]{2,3,4,1};
        assertArrayEquals(expectedOutput, ArraysDS.reverseArray(input));
    }
}