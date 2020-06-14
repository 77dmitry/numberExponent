package com.burst;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = 10000; i > 0; i--) {
            if (determineTheDegreeOfNumber(i, 4)) {   //replace 4 with any number whose degree we need
                integerList.add(i);
                System.out.println("Degree of = " + i);
            }
        }

        //same thing using stream api
        IntStream.range(1,10000)
                .filter(x -> {
                    while (true) {
                        if (x % 3 != 0) {          //replace 3 with any number whose degree we need
                            break;
                        }
                        x /= 3;                    //replace 3 with any number whose degree we need
                        if (x == 1) {
                            return true;
                        }
                    }
                    return false;
                })
                .forEach(System.out::println);
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
