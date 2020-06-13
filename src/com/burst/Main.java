package com.burst;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = 10000; i > 0; i--) {
            if (determineTheDegreeOfNumber(i, 9)) {
                integerList.add(i);
                System.out.println("Degree of = " + i);
            }
        }
    }

    private static boolean determineTheDegreeOfNumber(int value, int degreeOf) {
        while (true) {
            if (value % degreeOf != 0) {
                break;
            }
            value /= degreeOf;
            if (value == 1) {
                return true;
            }
        }
        return false;
    }
}
