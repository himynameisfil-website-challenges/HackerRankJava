package com.hackerrank.java.subdomain.datastructures;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Java1DArrayTest {

    @Test
    public void getReachableCells_game1() {
        int leap =   3;
        int[] game  = new int[]{0,0,0,0,0};
        List<Integer> reachableCells = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
        List<Integer> listOfInterest    =   Java1DArray.getReachableCells(leap, game);
        Collections.sort(listOfInterest);
        Collections.sort(reachableCells);
        Assert.assertEquals(reachableCells, listOfInterest);
    }

    @Test
    public void getReachableCells_game2() {
        int leap =   5;
        int[] game  = new int[]{0,0,0,1,1,1};
        List<Integer> reachableCells = new ArrayList<Integer>(Arrays.asList(0,1,2));
        List<Integer> listOfInterest    =   Java1DArray.getReachableCells(leap, game);
        Collections.sort(listOfInterest);
        Collections.sort(reachableCells);
        Assert.assertEquals(reachableCells, listOfInterest);
    }
    @Test
    public void getReachableCells_game3() {
        int leap =   3;
        int[] game  = new int[]{0,0,1,1,1,0};
        List<Integer> reachableCells = new ArrayList<Integer>(Arrays.asList(0,1));
        List<Integer> listOfInterest    =   Java1DArray.getReachableCells(leap, game);
        Collections.sort(listOfInterest);
        Collections.sort(reachableCells);
        Assert.assertEquals(reachableCells, listOfInterest);
    }

    @Test
    public void getReachableCells_game4() {
        int leap =   1;
        int[] game  = new int[]{0,1,0};
        List<Integer> reachableCells = new ArrayList<Integer>(Arrays.asList(0));
        List<Integer> listOfInterest    =   Java1DArray.getReachableCells(leap, game);
        Collections.sort(listOfInterest);
        Collections.sort(reachableCells);
        Assert.assertEquals(reachableCells, listOfInterest);
    }

    @Test
    public void getWinningCells_game1() {
        int leap =   3;
        int[] game  = new int[]{0,0,0,0,0};
        List<Integer> reachableCells = new ArrayList<Integer>(Arrays.asList(2,3,4));
        List<Integer> listOfInterest    =   Java1DArray.determineWinningCells(leap, game);
        Collections.sort(listOfInterest);
        Collections.sort(reachableCells);
        Assert.assertEquals(reachableCells, listOfInterest);
    }

    @Test
    public void getWinningCells_game2() {
        int leap =   5;
        int[] game  = new int[]{0,0,0,1,1,1};
        List<Integer> reachableCells = new ArrayList<Integer>(Arrays.asList(1,2));
        List<Integer> listOfInterest    =   Java1DArray.determineWinningCells(leap, game);
        Collections.sort(listOfInterest);
        Collections.sort(reachableCells);
        Assert.assertEquals(reachableCells, listOfInterest);
    }
    @Test
    public void getWinningCells_game3() {
        int leap =   3;
        int[] game  = new int[]{0,0,1,1,1,0};
        List<Integer> reachableCells = new ArrayList<Integer>(Arrays.asList(5));
        List<Integer> listOfInterest    =   Java1DArray.determineWinningCells(leap, game);
        Collections.sort(listOfInterest);
        Collections.sort(reachableCells);
        Assert.assertEquals(reachableCells, listOfInterest);
    }

    @Test
    public void getWinningCells_game4() {
        int leap =   1;
        int[] game  = new int[]{0,1,0};
        List<Integer> reachableCells = new ArrayList<Integer>(Arrays.asList(2));
        List<Integer> listOfInterest    =   Java1DArray.determineWinningCells(leap, game);
        Collections.sort(listOfInterest);
        Collections.sort(reachableCells);
        Assert.assertEquals(reachableCells, listOfInterest);
    }

    @Test
    public void canWin_game1() {
        int leap =   3;
        int[] game  = new int[]{0,0,0,0,0};
        assertTrue(Java1DArray.canWin(leap, game));
    }

    @Test
    public void canWin_game2() {
        int leap =   5;
        int[] game  = new int[]{0,0,0,1,1,1};
        assertTrue(Java1DArray.canWin(leap, game));
    }
    @Test
    public void canWin_game3() {
        int leap =   3;
        int[] game  = new int[]{0,0,1,1,1,0};
        assertFalse(Java1DArray.canWin(leap, game));
    }

    @Test
    public void canWin_game4() {
        int leap =   1;
        int[] game  = new int[]{0,1,0};
        assertFalse(Java1DArray.canWin(leap, game));
    }
}