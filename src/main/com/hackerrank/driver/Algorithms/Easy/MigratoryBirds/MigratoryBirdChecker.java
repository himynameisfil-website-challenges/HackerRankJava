package com.hackerrank.driver.Algorithms.Easy.MigratoryBirds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirdChecker {

    public int evaluate(List<Integer> arr) {
        HashMap<Integer, Integer> intCountMap = new HashMap<Integer, Integer>();

        for (Integer i : arr) {
            if (!intCountMap.containsKey(i)) {
                intCountMap.put(i, Collections.frequency(arr, i));
            }
        }

        Integer largestCount = Collections.max(intCountMap.values());
        Integer largestNumber = null;
        for (Integer key : intCountMap.keySet()) {
            if (intCountMap.get(key) == largestCount) {
                if ((largestNumber == null) || (largestNumber > key)) {
                    largestNumber = key;
                }
            }
        }
        return largestNumber;
    }
}
