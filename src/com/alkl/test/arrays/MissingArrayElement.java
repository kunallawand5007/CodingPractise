package com.alkl.test.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MissingArrayElement {

    public static void main(String[] args) {


        // n=n+1
        // Calculate the total sum
//        int n = nums.size() + 1;
//       int totalSum = n * (n + 1) / 2;


        // best solution is o(n) o(1)

        //15-11=4
        //Integer input[]={1, 5, 3, 2};
        //Integer input[]={8, 2, 4, 5, 3, 7, 1};
        //Integer input[]={1, 2, 3, 4, 6, 7, 8};
        Integer input[]={1, 2, 3, 4, 5, 6, 8, 9};


        List<Integer> list = Arrays.asList(input);

        long sum = list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        System.out.println(sum);
        int size1=input.length+1;
        int size2=size1+1;
        System.out.println((size1 * size2)/2 -sum);





        list.sort(Comparator.comparing(Integer::intValue));
        System.out.println(list);

        int size=list.get(list.size()-1);

        for(int i=0;i<size;i++){

            if(!list.contains(i+1)){
                System.out.println(i+1);
            }


        }



    }


}
