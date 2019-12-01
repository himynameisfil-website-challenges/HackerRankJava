package com.hackerrank.problemsolving;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class ArrayManipulationTest {

    @Test
    public void arrayManipulation_case0() {
        long expectedOutput=200;
        int[][] input   =   new int[][]{
                {
                    1,2,100
                },
                {
                    2,5,100
                },
                {
                    3,4,100
                }
        };
        assertEquals(expectedOutput, ArrayManipulation.arrayManipulation(5, input));
    }

    @Test
    public void arrayManipulation_case1() {
        long expectedOutput=10;
        int[][] input   =   new int[][]{
                {1,5,3},
                {4,8,7},
                {6,9,1}
        };
        assertEquals(expectedOutput, ArrayManipulation.arrayManipulation(10, input));
    }
    @Test
    public void arrayManipulation_case2() {
        long expectedOutput=31;
        int[][] input   =   new int[][]{
                {2,6,8},
                {3,5,7},
                {1,8,1},
                {5,9,15}
        };
        assertEquals(expectedOutput, ArrayManipulation.arrayManipulation(10, input));
    }
}