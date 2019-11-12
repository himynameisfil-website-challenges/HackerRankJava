package com.hackerrank.java.subdomain.strings;

import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A));

    }

    protected static String reverseString(String s) {
        List<Character> characterArray = new ArrayList<Character>();
        StringBuilder   reversedString  =   new StringBuilder();
        for (char character : s.toCharArray()) {
            characterArray.add(character);
        }

        Collections.reverse(characterArray);
        for (Character character : characterArray) {
            reversedString.append(character);
        }

        return reversedString.toString();
    }

    protected static String isPalindrome(String s) {
        if (s.toLowerCase().equals(reverseString(s).toLowerCase())) {
            return "Yes";
        } else {
            return "No";
        }
    }
}



