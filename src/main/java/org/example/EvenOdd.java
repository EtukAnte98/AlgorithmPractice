package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class EvenOdd {
    public static int findOutliers(List<Integer> integers) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 == 0) {
                evenNumbers.add(integers.get(i));
            }
            if (integers.get(i) % 2 != 0) {
                oddNumbers.add(integers.get(i));
            }
        }
        if (oddNumbers.size() == 1) {

            return oddNumbers.get(0);
        }
        if (evenNumbers.size() == 1) {
            return evenNumbers.get(0);
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(8,2,4,5,6,2,8);
        List<Integer> num1 = Arrays.asList(2,3,5,7,9,11,-33);
        System.out.println(findOutliers(num));
        System.out.println(findOutliers(num1));
    }
}

