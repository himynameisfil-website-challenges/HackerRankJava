package com.hackerrank.java.subdomain.bignumber;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    protected static String add(String a, String b) {
        BigInteger bigIntegerA  =   new BigInteger(a);
        BigInteger bigIntegerB  =   new BigInteger(b);
        return bigIntegerA.add(bigIntegerB).toString();
    }

    protected static String multiply(String a, String b) {
        BigInteger bigIntegerA  =   new BigInteger(a);
        BigInteger bigIntegerB  =   new BigInteger(b);
        return bigIntegerA.multiply(bigIntegerB).toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        String a =  scanner.nextLine();
        String b =  scanner.nextLine();

        System.out.println(add(a, b));
        System.out.println(multiply(a,b));
    }
}

