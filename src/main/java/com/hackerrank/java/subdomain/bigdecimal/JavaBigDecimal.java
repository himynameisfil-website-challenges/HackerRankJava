package com.hackerrank.java.subdomain.bigdecimal;

import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        List<String> listOfBDAsString   =   new LinkedList<String>();
        String numToProcess;
        BigDecimal  numberOfInterest, comparisonNumber;
        Boolean     hasAddedNumber;
        for (int i=0; i < s.length - 2; i++) {
            numToProcess    =   s[i];

            numberOfInterest    =   new BigDecimal(numToProcess);
            if (listOfBDAsString.isEmpty()) {
                listOfBDAsString.add(numToProcess);
            } else {
                hasAddedNumber  =   false;
                for (int j = 0; j < listOfBDAsString.size(); j++) {
                    comparisonNumber    =   new BigDecimal(listOfBDAsString.get(j));
                    if (numberOfInterest.compareTo(comparisonNumber) == 1) {
                        listOfBDAsString.add(j, numToProcess);
                        hasAddedNumber    =   true;
                        break;
                    }
                }
                if (!hasAddedNumber) {
                    listOfBDAsString.add(numToProcess);
                }
            }
            // System.out.println("Printing the list as is...");
            // for (String str: listOfBDAsString) {
            //     System.out.println(str);
            // }
        }

        s = listOfBDAsString.toArray(new String[0]);
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}