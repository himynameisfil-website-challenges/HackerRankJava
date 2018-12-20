package com.hackerrank.algorithms.easy.sockmatching;

import java.util.*;

public class SockMerchantProgram {

    private int n;
    private int[] ar;

    public SockMerchantProgram() {

    }

    public void setN(int n) {
        this.n = n;
    }

    public void setAr(int[] ar) {
        this.ar = ar;
    }

    public static int sockMerchant(Integer sockCount, int[] arr) {
        Integer[] objectArr =   new Integer[arr.length];
        Integer sockPairCount = 0;
        for (int j=0; j< arr.length; j++) {
            objectArr[j] = arr[j];
        }
        List<Integer> arrOfInterest    =   Arrays.asList(objectArr);
        Set<Integer> uniqueArrOfInterest    =   new HashSet<Integer>(arrOfInterest);

        for (Integer i : uniqueArrOfInterest) {
            sockPairCount+= Math.floorDiv(Collections.frequency(arrOfInterest, i), 2);
        }
        return sockPairCount;
    }
}
