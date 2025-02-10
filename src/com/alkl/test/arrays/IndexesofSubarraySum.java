package com.alkl.test.arrays;

import java.util.Scanner;

public class IndexesofSubarraySum {

    public static void main(String[] args) {

//https://www.geeksforgeeks.org/explore?page=2&category=Arrays&sortBy=submissions


//        int input[]={1, 2, 3, 7, 5};
//        int target=4;

//        int input[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int target = 15;
        int input[] = {5, 3, 4};
        int target = 2;


        int left = 0;
        int sum = 0;
        boolean isFound = false;
        for (int i = 0; i < input.length; i++) {
            left = i;
            for (int j = i; j < input.length; j++) {
                sum = sum + input[j];
                if (target == sum) {
                    j = j + 1;
                    left = left + 1;
                    System.out.println("Left:" + left + "  right:" + j);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
            sum = 0;
        }
        if (Boolean.FALSE.equals(isFound)) {
            System.out.println(-1);
        }


    }
}
