package com.hackerrank.driver.Algorithms.Easy.BonAppetit;

import java.util.ArrayList;
import java.util.List;

public class ExpectedChargeCalculator {
    public String evalutator(List<Integer> bill, Integer itemSkipped, Integer billCharged) {
        ArrayList<Integer> arrayOfInterest = (ArrayList<Integer>) bill;
        arrayOfInterest.remove((int) itemSkipped);
        Double expectedBillAmount = 0.00;
        for (Integer i : arrayOfInterest) {
            expectedBillAmount += i;
        }

        expectedBillAmount= expectedBillAmount/2;
        if (expectedBillAmount <  billCharged) {
            return Integer.toString((int) (billCharged - expectedBillAmount.intValue()));
        } else {
            return "Bon Appetit";
        }
    }
}
