package com.hackerrank.java.subdomain.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaStringCompareTest {

    @Test
    public void determineSubstringList() {
        String s    =   "welcometojava";
        int k       =   3;
        String[] expectedArray  =   new String[] {"wel", "elc", "lco", "com", "ome", "met", "eto", "toj", "oja", "jav", "ava"};

        assertArrayEquals(expectedArray, JavaStringCompare.determineSubstringList(s, k));
    }

    @Test
    public void getLargest() {
        String[] testArray  =   new String[] {"wel", "elc", "lco", "com", "ome", "met", "eto", "toj", "oja", "jav", "ava"};
        assertEquals("wel", JavaStringCompare.getLargest(testArray));
    }

    @Test
    public void getSmallest() {
        String[] testArray  =   new String[] {"wel", "elc", "lco", "com", "ome", "met", "eto", "toj", "oja", "jav", "ava"};
        assertEquals("ava", JavaStringCompare.getSmallest(testArray));
    }
}