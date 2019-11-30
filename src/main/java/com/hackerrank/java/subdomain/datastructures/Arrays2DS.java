package com.hackerrank.java.subdomain.datastructures;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays2DS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int hourglassOfInterest, largestHourglass = 0;
        for (int i=0; i < arr.length-2; i++) {
            for (int j=0; j < arr.length-2; j++) {
                hourglassOfInterest=calculateIndividualHourglass(i,j,arr);
                if (i == 0 && j == 0) {
                    largestHourglass=hourglassOfInterest;
                } else {
                    largestHourglass = (hourglassOfInterest > largestHourglass) ? hourglassOfInterest : largestHourglass;
                }
            }
        }
        return largestHourglass;
    }

    private static int calculateIndividualHourglass(int topLeftColumn, int topLeftRow, int[][] arr) {
        int output = 0;
        for (int i=0; i< 3; i++) {
            output+=arr[topLeftRow][topLeftColumn+i];
        }
        output+=arr[topLeftRow+1][topLeftColumn+1];
        for (int i=0; i< 3; i++) {
            output+=arr[topLeftRow+2][topLeftColumn+i];
        }
        System.out.println("Printing the column, row, and output: " );
        System.out.println(topLeftColumn );
        System.out.println(topLeftRow);
        System.out.println(output);
        return output;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
