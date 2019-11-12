package com.hackerrank.java.subdomain.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaStringTokensTest {

    @Test
    public void tokenSplitter() {
        String strOfInterest    =   "He is a very very good boy, isn't he?";
        String[] strArr         =   new String[] {"He", "is", "a", "very", "very", "good", "boy", "isn", "t", "he"};

        assertArrayEquals(strArr, JavaStringTokens.tokenSplitter(strOfInterest));
        assertEquals(10, JavaStringTokens.tokenSplitter(strOfInterest).length);
    }
}