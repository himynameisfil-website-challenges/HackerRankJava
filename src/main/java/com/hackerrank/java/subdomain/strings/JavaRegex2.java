package com.hackerrank.java.subdomain.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2 {

    public static void main(String[] args) {

        String regex = "\\w+";
        Pattern p = Pattern.compile(regex );

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            StringBuilder output   = new StringBuilder();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                System.out.println(m.group());
                input = input.replaceAll("(?i)"+"Bye", "asdf");
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}

