package com.hackerrank.java.subdomain.strings;

import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringAnalyzer  stringAnalyzer  =   new StringAnalyzer(A, B);
        System.out.println(stringAnalyzer.getTotalLenghts());
        System.out.println(stringAnalyzer.aLexoGreaterB());
        System.out.println(stringAnalyzer.combineStringUppercaseFirstLetter());
    }
}

class StringAnalyzer {
    private String A;
    private String B;
    public StringAnalyzer(String a, String b) {
        this.A  =   a;
        this.B  =   b;
    }

    public int getTotalLenghts() {
        return (this.A + this.B).length();
    }

    public String aLexoGreaterB() {
        if (this.A.compareTo(this.B) > 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String combineStringUppercaseFirstLetter() {
        StringBuilder stringOfInterest  =   new StringBuilder();
        stringOfInterest.append(this.A.substring(0,1).toUpperCase());
        stringOfInterest.append(this.A.substring(1));
        stringOfInterest.append(" ");
        stringOfInterest.append(this.B.substring(0,1).toUpperCase());
        stringOfInterest.append(this.B.substring(1));
        return stringOfInterest.toString();
    }
}

