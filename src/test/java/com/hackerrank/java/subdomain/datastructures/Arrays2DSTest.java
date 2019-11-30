package com.hackerrank.java.subdomain.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class Arrays2DSTest {

    @Test
    public void hourglassSum() {
        int[][] input = new int[][]{{1,1,1,0,0,0}, {0,1,0,0,0,0}, {1,1,1,0,0,0}, {0,0,2,4,4,0}, {0,0,0,2,0,0}, {0,0,1,2,4,0}};

        int expectedOutput=19;

        assertEquals(expectedOutput, Arrays2DS.hourglassSum(input));
    }
}