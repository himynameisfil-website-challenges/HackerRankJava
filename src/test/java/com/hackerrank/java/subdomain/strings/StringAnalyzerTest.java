package com.hackerrank.java.subdomain.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringAnalyzerTest {
    private StringAnalyzer  stringAnalyzer;

    @Test
    public void getTotalLenghts_SampleInput0() {
        setupSampleInput0();
        assertEquals(9, stringAnalyzer.getTotalLenghts());
    }

    @Test
    public void aLexoGreaterB_SampleInput0() {
        setupSampleInput0();
        assertEquals("No", stringAnalyzer.aLexoGreaterB());
    }

    @Test
    public void combineStringUppercaseFirstLetter_SampleInput0() {
        setupSampleInput0();
        assertEquals("Hello Java", stringAnalyzer.combineStringUppercaseFirstLetter());
    }

    private void setupSampleInput0() {
        this.stringAnalyzer =   new StringAnalyzer("hello", "java");
    }
}