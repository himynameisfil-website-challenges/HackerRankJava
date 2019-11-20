package com.hackerrank.java.subdomain.datastructures;

import java.util.*;

public class Java1DArray {

    public static boolean canWin(int leap, int[] game) {
        List<Integer> winningCells  =   determineWinningCells(leap, game);
        List<Integer> reachableCells    =   getReachableCells(leap, game);
        for (Integer winner : winningCells) {
            if (reachableCells.contains(winner)) {
                return true;
            }
        }

        return false;
        // Return true if you can win the game; otherwise, return false.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

    //Since you win by leaping from a cell to off the board, this determines the spots where you can leap off to victory
    public static List<Integer> determineWinningCells(int leap, int[] game) {
        List<Integer> listOfWinningCells    =   new ArrayList<Integer>();
        for (int i= game.length - leap ; i < game.length; i++) {
            if (isLandable(game[i])) {
                listOfWinningCells.add(i);
            }
        }
        return listOfWinningCells;
    }
// starts off with the initial reachable cell(the start) and adds every game cell it can get to on the board.
    public static List<Integer> getReachableCells(int leap, int[] game) {
        List<Integer> reachableCells    =   new ArrayList<Integer>();
        reachableCells.add(0);
        reachableCells  =   addToReachableCells(leap, game, reachableCells);
        return reachableCells;
    }
//Goes through every currently reachable cell and checks the one before it, the one after it, and the one a leap size away from it... if it's in the game board, can be landed on, and isn't already on the list of reachable cells, add it... until there's nothing left to add
    private static List<Integer> addToReachableCells(int leap, int[] game, List<Integer> currentList) {
//        System.out.println("Printing the current list of reachable cells");
//        for (Integer integer : currentList) {
//            System.out.print(integer + ",");
//        }
        for (Integer currentReachableInt : currentList) {
            if (isInGamefield(currentReachableInt - 1, game) && isLandable(game[currentReachableInt - 1]) && !currentList.contains(currentReachableInt - 1)) {
//                System.out.println("Found a new reachable cell : " + (currentReachableInt - 1));
                currentList.add(currentReachableInt - 1);
                return addToReachableCells(leap, game, currentList);
            }
            if (isInGamefield(currentReachableInt + 1, game) && isLandable(game[currentReachableInt + 1]) && !currentList.contains(currentReachableInt + 1)) {
//                System.out.println("Found a new reachable cell : " + (currentReachableInt + 1));
                currentList.add(currentReachableInt + 1);
                return addToReachableCells(leap, game, currentList);
            }
            if (isInGamefield(currentReachableInt + leap, game) && isLandable(game[currentReachableInt + leap]) && !currentList.contains(currentReachableInt + leap)) {
//                System.out.println("Found a new reachable cell : " + (currentReachableInt + leap));
                currentList.add(currentReachableInt + leap);
                return addToReachableCells(leap, game, currentList);
            }
        }
        return currentList;
    }

    private static Boolean isLandable(int i) {
        return String.valueOf(i).contains("0");
    }

    private static Boolean isInGamefield(Integer i, int[] game) {
        return i >=0 && i < game.length;
    }
}

