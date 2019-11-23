package com.hackerrank.problemsolving;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SparseArrayTest {

    @Test
    public void matchingStrings_first_test_case() {
        String[] fullArray  =   new String[]{"aba", "baba", "aba", "xzxb"};
        String[] checkerArray  =   new String[]{"aba", "baba", "ab"};
        int[]   expectedOutput  =   new int[]{2,1,0};

        assertArrayEquals(expectedOutput, SparseArray.matchingStrings(fullArray, checkerArray));
    }
    @Test
    public void matchingStrings_second_test_case() {
        String[] fullArray  =   new String[]{"def", "de", "fgh"};
        String[] checkerArray  =   new String[]{"de", "lmn", "fgh"};
        int[]   expectedOutput  =   new int[]{1,0,1};

        assertArrayEquals(expectedOutput, SparseArray.matchingStrings(fullArray, checkerArray));
    }
}