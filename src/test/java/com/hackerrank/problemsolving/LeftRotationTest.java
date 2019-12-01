package com.hackerrank.problemsolving;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void rotateArray() {
        int[] expectedResult    =   new int[]{5,1,2,3,4};
        assertArrayEquals(expectedResult, LeftRotation.rotateArray(4, new int[]{1,2,3,4,5}));
        
    }
}