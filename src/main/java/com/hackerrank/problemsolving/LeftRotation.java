package com.hackerrank.problemsolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.apache.commons.lang3.StringUtils;


public class LeftRotation {

    protected static int[] rotateArray(int nRotations, int[] initial) {
        int[] returnArray   =   new int[initial.length];
        int newPosition;
        for (int i=0;i<initial.length;i++) {
            newPosition =   (i-nRotations + initial.length) % initial.length;
            returnArray[newPosition]    =   initial[i];
        }
        return returnArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);
//        System.out.println("Got here and read the first line");
        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
//        System.out.println("Got here and read the second line");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
//            System.out.println("Processing the i'th element : " + i + ":" + a[i]);
        }
//        System.out.println("Got here");
        for (int i : rotateArray(d, a)) {
            System.out.print(i + " ");
        }
//        System.out.println(StringUtils.join( rotateArray(d, a), " "));
    }
}
