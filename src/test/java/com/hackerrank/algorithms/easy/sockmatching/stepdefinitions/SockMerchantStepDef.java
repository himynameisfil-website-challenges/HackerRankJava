package com.hackerrank.algorithms.easy.sockmatching.stepdefinitions;


import com.hackerrank.algorithms.easy.sockmatching.SockMerchantProgram;
import cucumber.api.DataTable;
import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class SockMerchantStepDef {
    SockMerchantProgram sockMerchantProgram;
    Integer actualResult;
    @Given("^A Sock Matching program$")
    public void aSockMatchingProgram() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sockMerchantProgram = new SockMerchantProgram();

    }

    @When("^there are (\\d+) socks with colors$")
    public void thereAreSocksWith(Integer sockCount, DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<List<String>> tableOfInterest;
        tableOfInterest = table.raw();
        sockMerchantProgram.setN(sockCount);
        int[] arr = new int[sockCount];
        for (int i=0; i< tableOfInterest.get(0).size(); i++) {
            arr[i] = Integer.parseInt(tableOfInterest.get(0).get(i));
        }
        actualResult = SockMerchantProgram.sockMerchant(sockCount, arr);
    }

    @Then("^we can sell (\\d+) pairs of socks$")
    public void weCanSellPairsOfSocks(Integer expectedCount) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expectedCount, actualResult);
    }
}
