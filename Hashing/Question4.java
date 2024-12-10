package Hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Problem: Check if the following given array contains duplicate elements within k distance from each other.
 *
 * Given an unsorted array that may contain duplicates. Also given a number k which is smaller than the size of the array, returns true if the array contains duplicates within k distance.
 *
 *
 *
 * Example-1:
 *
 * Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
 *
 * Output: false*/
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,1,2,3,4};
        int k = 3; //Distance
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], i);
            }
            else{
                int difference = i-hm.get(arr[i]);
                if(difference<=k){
                    System.out.println(true);
                    return;
                }
                else{
                    hm.put(arr[i], i);
                }
            }
        }
        System.out.println(false);
    }
}
