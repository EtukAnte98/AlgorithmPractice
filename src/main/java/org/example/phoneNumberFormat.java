package org.example;


    public class phoneNumberFormat {
        public static void main(String [] arg){
            int [] digits = {1,2,3,4,5,6,7,8,9,0};
            String formatted = createPhoneNumber(digits);
            System.out.println(formatted);
        }
        public static String createPhoneNumber(int[] numbers) {
            StringBuilder sb = new StringBuilder();
            sb.append ("(");
            for(int i = 0; i < numbers.length; i++){
                if(i == 3){
                    sb.append(") ");
                }else if(i == 6){
                    sb.append("-");
                }
                sb.append(numbers[i]);
            }
            return sb.toString();
        }
    }

//        Question1: Write a Java program to calculate the sum of all numbers from 1 to N.
//        Example: Input: 5 Output: 15 (since 1 + 2 + 3 + 4 + 5 = 15)
//
//        Question2: Write a Java program to find the Fibonacci sequence up to a given number of terms.
//        Example: Input: 8 Output: 0, 1, 1, 2, 3, 5, 8, 13
//
//        Question3: Write a Java program to check if a string is a palindrome.
//        Example: Input: "racecar" Output: true
//
//        Question4: Write a Java program to sort an array of integers in ascending order.
//        Example: Input: [5, 2, 8, 3, 1] Output: [1, 2, 3, 5, 8]
//
//        Question5: Write a Java program to find the factorial of a given number using recursion.
//        Example: Input: 4 Output: 24 (since 4! = 4 * 3 * 2 * 1 = 24)
//
//        The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones. It starts with 0 and 1, and the subsequent numbers are obtained by adding the two previous numbers together.