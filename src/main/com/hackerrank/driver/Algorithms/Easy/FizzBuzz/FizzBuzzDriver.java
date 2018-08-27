package com.hackerrank.driver.Algorithms.Easy.FizzBuzz;

public class FizzBuzzDriver {


    public static void main(String[] args) {
        FizzBuzzConverter fbConvert = new FizzBuzzConverter();
        for (int i=1; i<100; i++) {
            System.out.println(fbConvert.convert(i));
        }
    }
}