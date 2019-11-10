package com.hackerrank.java.easy;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class JavaStaticInitializerBlockTest {
    private ByteArrayOutputStream out;
    private Scanner scanner;

    @Before
    public void setup() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        scanner = new Scanner(System.in);
    }

    @Test
    public void acceptance_test_1() throws Exception {
        System.setIn(new ByteArrayInputStream("1\n3".getBytes()));

        new JavaStaticInitializerBlock();
        JavaStaticInitializerBlock.main(null);
        assertEquals("3",out.toString());
    }
    @Test
    public void acceptance_test_2() throws Exception {
        System.setIn(new ByteArrayInputStream("-1\n2".getBytes()));

        new JavaStaticInitializerBlock();
        JavaStaticInitializerBlock.main(null);
        assertEquals("java.lang.Exception: Breadth and height must be positive",out.toString());
    }
}