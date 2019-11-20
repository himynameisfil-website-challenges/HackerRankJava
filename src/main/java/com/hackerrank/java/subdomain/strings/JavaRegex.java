package com.hackerrank.java.subdomain.strings;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public MyRegex() {};
    private String ZERO_THROUGH_99  =   "0?[0-9]{1,2}?";
    private String ONE_HUNDRED_TO_TWO_HUNDRED   =   "1[0-9]{1,2}?";
    private String TWO_HUNDRED_TO_255 = "2[0-4][0-9]|25[0-5]";
    private String ZERO_THROUGH_255_REGEX   =   "(" + ZERO_THROUGH_99 + "|" + ONE_HUNDRED_TO_TWO_HUNDRED + "|" + TWO_HUNDRED_TO_255 + ")";
    public String pattern   =   ZERO_THROUGH_255_REGEX + "." + ZERO_THROUGH_255_REGEX + "." + ZERO_THROUGH_255_REGEX + "." + ZERO_THROUGH_255_REGEX;
}
