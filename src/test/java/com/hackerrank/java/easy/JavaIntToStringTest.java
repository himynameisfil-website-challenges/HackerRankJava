package com.hackerrank.java.easy;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class JavaIntToStringTest {
    private ByteArrayOutputStream out;
    private Scanner scanner;

    @Before
    public void setup() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        scanner = new Scanner(System.in);
    }

    @Test
    public void acceptance_test_1() {
        System.setIn(new ByteArrayInputStream("100".getBytes()));
        JavaIntToString.main(null);
        assertThat(out.toString(), containsString("Good job"));
    }
}