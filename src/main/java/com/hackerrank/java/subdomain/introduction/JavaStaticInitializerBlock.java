package com.hackerrank.java.subdomain.introduction;
import org.junit.Test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/java-static-initializer-block/problem?h_r=next-challenge&h_v=zen
public class JavaStaticInitializerBlock {
    private static int B ;
    private static int H ;
    private static Boolean flag;
    static Scanner scanner =   new Scanner(System.in);

    static {
        B   =   scanner.nextInt();
        H   =   scanner.nextInt();
//        System.out.println("Set B as : " + B);
//        System.out.println("Set H as : " + H);
        try {
            flag    =   areValuesPositive(B, H);
        } catch (Exception e) {
            flag    =   false;
            System.out.print(e);
        }
//        System.out.println("Set flag as : " + flag);
    }

    protected static Boolean areValuesPositive(int a, int b) throws Exception{
        if (a <= 0 || b <= 0 ) {
            throw new Exception("Breadth and height must be positive");
        } else {
            return true;
        }
    }


    public static void main(String[] args){
//        System.out.println("Hello world");
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}


