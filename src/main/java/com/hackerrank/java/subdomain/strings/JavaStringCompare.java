package com.hackerrank.java.subdomain.strings;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-compare
public class JavaStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] stringAsSubsetArray    =   determineSubstringList(s, k);
        smallest    =   getSmallest(stringAsSubsetArray);
        largest     =   getLargest(stringAsSubsetArray);

        return smallest + "\n" + largest;
    }

    public static String[] determineSubstringList (String s, int k){
        String[] listOfInterest =   new String[s.length() + 1 - k];

        for (int i=0; i < s.length() + 1 - k; i++) {
            listOfInterest[i] = s.substring(i, i+k);
        }
        return listOfInterest;
    }

    public static String getLargest(String[] arr) {
        String stringOfInterest =   null;
        for (String element : arr) {
            if (stringOfInterest == null) {
                stringOfInterest    =   element;
                continue;
            }

            if (stringOfInterest.compareTo(element) <= 0) {
                stringOfInterest    =   element;
            }
        }
        return stringOfInterest;
    }
    public static String getSmallest(String[] arr) {
        String stringOfInterest =   null;
        for (String element : arr) {
            if (stringOfInterest == null) {
                stringOfInterest    =   element;
                continue;
            }

            if (stringOfInterest.compareTo(element) >= 0) {
                stringOfInterest    =   element;
            }
        }
        return stringOfInterest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
