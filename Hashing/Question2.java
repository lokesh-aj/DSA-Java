package Hashing;

/**
 * Problem: Check if a given array is a subset of another array. Duplicate elements can be present.
 *
 * Given two arrays, arr1 and arr2, check if arr2 is a subset of arr1.
 *
 *
 *
 * Example-1:
 *
 * Input:
 *
 * arr1 = {2,4,7,1,5,5}
 *
 * arr2 = {5,4,2}
 *
 * Output: arr2 is a subset of arr1
 *
 * Explanation: All elements of arr2 are present in arr1.
 * */
import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {2,4,7,1,5,5};
        int[] arr2 = {5,4,2};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<arr2.length;i++){
            hm.put(arr2[i],0);
        }

        for(int i=0; i<arr1.length;i++){
            if(hm.containsKey(arr1[i])){
                int val = hm.get(arr1[i]);
                hm.put(arr1[i], val+1);
            }
        }

        if(hm.containsValue(0)){
            System.out.println("Array 2 is not the subset");
        }
        else {
            System.out.println("Array 2 is the subset");
        }
    }
}
