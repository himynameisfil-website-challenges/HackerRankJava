package com.hackerrank.driver.Algorithms.Easy.MigratoryBirds;


import com.hackerrank.driver.Algorithms.Easy.MigratoryBirds.MigratoryBirdChecker;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/*
https://www.hackerrank.com/challenges/migratory-birds/problem
You have been asked to help study the population of birds migrating across the continent. Each type of bird you are
interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number
will be added to your array of sightings. You would like to be able to find out which type of bird is most common given
a list of sightings. Your task is to print the type number of that bird and if two or more types of birds are equally
common, choose the type with the smallest ID number.

For example, assume your bird sightings are of types . There are two each of types  and , and one sighting of type .
Pick the lower of the two types seen twice: type .


 */
public class MigratoryBirdsTest {

    @Test
    public void MostCommonBirdOnly1ClearWinner() {
        MigratoryBirdChecker migratoryBirdChecker = new MigratoryBirdChecker();
        int[] arr;
        arr = new int[]{1,4,4,4,5,3};
        ArrayList<Integer> arrOfInterest = new ArrayList<Integer>();
        for (int i : arr) {
            arrOfInterest.add(i);
        }
        Assert.assertEquals(4, migratoryBirdChecker.evaluate(arrOfInterest));

    }

    @Test
    public void MostCommonBirdOnly1ClearWinner2() {
        MigratoryBirdChecker migratoryBirdChecker = new MigratoryBirdChecker();
        int[] arr;
        arr = new int[]{1,1,2,2,3};
        ArrayList<Integer> arrOfInterest = new ArrayList<Integer>();
        for (int i : arr) {
            arrOfInterest.add(i);
        }
        Assert.assertEquals(1, migratoryBirdChecker.evaluate(arrOfInterest));

    }

    @Test
    public void MostCommonBirdUnclearWinner() {
        MigratoryBirdChecker migratoryBirdChecker = new MigratoryBirdChecker();
        int[] arr;
        arr = new int[]{1,2,3,4,5,4,3,2,1,3,4};
        ArrayList<Integer> arrOfInterest = new ArrayList<Integer>();
        for (int i : arr) {
            arrOfInterest.add(i);
        }
        Assert.assertEquals(3, migratoryBirdChecker.evaluate(arrOfInterest));

    }

}
