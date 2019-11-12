package com.hackerrank.java.subdomain.strings;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] strArr =   tokenSplitter(s.trim());
        System.out.println(strArr.length);
        for (String str: strArr) {
            System.out.println(str);
        }
        scan.close();
    }

    public static String[] tokenSplitter(String s) {
        if (s.length() == 0) {
            return new String[]{};
        }
        return s.trim().split("[ !,/?._'@]+");
    }
}


