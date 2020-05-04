package com.mycompany.app;

import java.util.Hashtable;

public class Challenge {

    private Hashtable<String, Integer> dictionary;
    private final String FIZZ = "fizz";
    private final String BUZZ = "buzz";
    private final String FIZZBUZZ = "fizzbuzz";
    private final String LUCKY = "lucky";
    private final String INTEGER = "integer";

    public Challenge() {
        initializeDictionary();
    }

    public void runChallenge(int n) {
        for (int i = 0; i < n; i++) {
            int currentNum = i + 1;
            String outputString = determineOutput(currentNum);
            logStringToDictionary(outputString);
            System.out.println(outputString);
        }

        System.out.println();

        dictionary
            .forEach((key, value) -> {
                    System.out.println(key + ": " + value);
                });
    }

    private void initializeDictionary() {
        dictionary = new Hashtable<String, Integer>();
        dictionary.put(FIZZ, 0);
        dictionary.put(BUZZ, 0);
        dictionary.put(FIZZBUZZ, 0);
        dictionary.put(LUCKY, 0);
        dictionary.put(INTEGER, 0);
    }

    public String determineOutput(int n) {

        String result = "";

        if (intContainsThree(n)) {
            result = LUCKY;
        } else if (n % 15 == 0) {
            result = FIZZBUZZ; } 
        else if (n % 5 == 0) {
            result = BUZZ;
        } else if (n % 3 == 0) {
            result = FIZZ;
        } else {
            result = Integer.toString(n);
        }

        return result;
    }

    public boolean intContainsThree(int n) {
        return Integer.toString(n).contains("3");
    }

    private void logStringToDictionary(String result) {
        if (dictionary.containsKey(result)) {
            int currentInstances = dictionary.get(result) + 1;
            dictionary.put(result, currentInstances);
        } else {
            int currentInstances = dictionary.get(INTEGER) + 1;
            dictionary.put(INTEGER, currentInstances);
        }
    }
}
