package com.hackerrank.driver.Algorithms.Easy.BonAppetit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetitTest {

    @Test
    public void Sample1Test1() {
        ExpectedChargeCalculator expectedChargeCalculator = new ExpectedChargeCalculator();
        List<Integer> bill = new ArrayList<Integer>(Arrays.asList(3, 10, 2, 9));
        Integer itemSkipped = 1;
        Integer billCharged = 12;
        Assert.assertEquals("5", expectedChargeCalculator.evalutator(bill, itemSkipped, billCharged));

    }

    @Test
    public void Sample1Test2() {
        ExpectedChargeCalculator expectedChargeCalculator = new ExpectedChargeCalculator();
        List<Integer> bill = new ArrayList<Integer>(Arrays.asList(3, 10, 2, 9));
        Integer itemSkipped = 1;
        Integer billCharged = 7;
        Assert.assertEquals("Bon Appetit", expectedChargeCalculator.evalutator(bill, itemSkipped, billCharged));

    }
}
