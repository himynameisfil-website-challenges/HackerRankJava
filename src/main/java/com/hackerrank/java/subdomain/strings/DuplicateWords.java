package com.hackerrank.java.subdomain.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    //definitely copied
    public static void main(String[] args) {
        List<String> inList =   new ArrayList<String>();
        List<String> outList =   new ArrayList<String>();

        String regex = "(\\w+)";
        Pattern p = Pattern.compile(regex);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            inList =   new ArrayList<String>();
            outList =   new ArrayList<String>();
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                for (int i = 0 ; i < m.groupCount(); i++) {
                    inList.add(m.group(i));
                }
            }

            for (int i = 0; i < inList.size(); i++) {
                if (!listContainsWord(outList, inList.get(i))) {
                    outList.add(inList.get(i));
                }
            }

            StringBuilder stringBuilder =   new StringBuilder();

            for (int i = 0; i < outList.size(); i++) {
                stringBuilder.append(outList.get(i));
                if (i != outList.size() - 1) {
                    stringBuilder.append(" ");
                }
            }

            // Prints the modified sentence.
            System.out.println(stringBuilder.toString());
        }

        in.close();
    }

    private static Boolean listContainsWord(List<String> list, String word) {
        for (String listItem : list) {
            if (listItem.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }
}

