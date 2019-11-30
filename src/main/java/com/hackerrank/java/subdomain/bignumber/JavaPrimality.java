package com.hackerrank.java.subdomain.bignumber;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaPrimality {

    protected static String determinePrimeness(String n) {
        BigInteger bigInteger   =   new BigInteger(n);
        if (bigInteger.isProbablePrime(100)) {
            return "prime";
        } else {
            return "not prime";
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        System.out.println(determinePrimeness(n));
        scanner.close();
    }
}
