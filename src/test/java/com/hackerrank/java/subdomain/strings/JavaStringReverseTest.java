package com.hackerrank.java.subdomain.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaStringReverseTest {

    @Test
    public void reverseArrayTest() {
        String stringOfInterest =   "asdf";
        String stringOfInterestInReverse    =   "fdsa";

        assertEquals(stringOfInterestInReverse, JavaStringReverse.reverseString(stringOfInterest));
    }

    @Test
    public void reverseArrayTest2() {
        String stringOfInterest =   "This is a random sentence";
        String stringOfInterestInReverse    =   "ecnetnes modnar a si sihT";

        assertEquals(stringOfInterestInReverse, JavaStringReverse.reverseString(stringOfInterest));
    }

    @Test
    public void isPalindrome() {
        assertEquals("Yes", JavaStringReverse.isPalindrome("madam"));
    }
}