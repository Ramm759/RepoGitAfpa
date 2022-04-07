package com.afpa.testing;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

    public int add(int a, int b) {
        return a + b;

    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void longCalculation() {
        try {
            // Attendre 2 secondes
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public Set<Integer> digitsSet(int number) {
        Set<Integer> integers = new HashSet<Integer>();
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) != '-') {
                integers.add(Integer.parseInt(String.valueOf(numberString.charAt(i))));
            }
        }
        return integers;
    }
}
