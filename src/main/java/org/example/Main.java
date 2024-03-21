package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 4, 5, 6, 7, 8, 2, 4, 1, 1, 3, 7};
//        int count = checkOdd(num);
//        System.out.println("The odd numbers are: " + count);
//        checkOdd(num);
        checkOdd(num);
    }

    public static int[] checkOdd(int[] a) {
//        if(a.length % 2 != 0 && a.length > 0)
//            return a[0] + 1;
//        Arrays.sort(a);
//        int [] pickOdd = new int[0];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                counter++;
            }
        }
        System.out.println(counter);
        int[] pickOdd = new int[counter];
        int index = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                pickOdd[index] = a[j];
                index++;
            }
        }
        System.out.println(Arrays.toString(pickOdd));
        return pickOdd;
    }
}















