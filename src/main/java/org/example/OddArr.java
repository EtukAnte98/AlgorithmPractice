package org.example;

import java.util.Arrays;

public class OddArr {
    public static int[] odd(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                counter++;
            }
        }
        System.out.println(counter);
        int[] oddArr = new int[counter];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(oddArr));
       return oddArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9};
        odd(arr);
    }
}
