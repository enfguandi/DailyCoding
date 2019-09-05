package com.company.Day011;

import java.util.ArrayList;

public class Day011 {

    public void Day011() {
        String queryString = "de";
        ArrayList<String> setOfStrings = new ArrayList();

        setOfStrings.add("dog");
        setOfStrings.add("deer");
        setOfStrings.add("deal");

        for (int i = 0; i < setOfStrings.size(); i++) {
            String result = splitText(setOfStrings.get(i), queryString.length());
            if (result.equals(queryString)) {
                System.out.println(result + " " + setOfStrings.get(i));
            }
        }


    }

    private static String splitText(String text, int size) {
        ArrayList part = new ArrayList();

        String message = text.substring(0, Math.min(0 + size, text.length()));

        return message;
    }
}
