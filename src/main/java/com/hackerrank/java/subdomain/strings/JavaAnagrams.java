package com.hackerrank.java.subdomain.strings;

import java.util.Scanner;

public class JavaAnagrams {
    private static boolean isAnagram(String a, String b) {
        char[] arrayA   =   a.toLowerCase().trim().toCharArray();
        char[] arrayB   =   b.toLowerCase().trim().toCharArray();
        java.util.Arrays.sort(arrayA);
        java.util.Arrays.sort(arrayB);
        return (java.util.Arrays.equals(arrayA, arrayB));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
