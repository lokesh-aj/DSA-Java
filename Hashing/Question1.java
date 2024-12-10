package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Check if following given array is subset of another array.
 *
 * Given two arrays, arr1 and arr2, check if arr2 is a subset of arr1. You can assume there are no duplicates in both the arrays.
 *
 *
 *
 * Example-1:
 *
 * Input:
 *
 * arr1 = {2,4,7,1,5}
 *
 * arr2 = {5,4,2}
 * */

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {6,7,3,2};
        int[] arr2 = {2,3,5};
        //bruteforce method => O(n*q)
//        int count = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if(arr2[i] == arr1[j]){
//                    count++;
//                }
//            }
//        }
//        if(count == arr2.length){
//            System.out.println("Array 2 is a subset");
//        }
//        else{
//            System.out.println("Array 2 is not a subset");
//        }

        //Hashing method (HashSet) =>O(n)
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(!hs.contains(arr2[i])){
                System.out.println("Array 2 is not a subset");
                return;
            }
        }

        System.out.println("Array 2 is a subset");


    }
}
