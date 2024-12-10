package Hashing;
/**
 * Minimum operations to make all elements equal in an array.
 *
 * Given an array consisting of positive integers, return the minimum number of operations to make all the elements of the array equal. The operations can be addition, multiplication, division, or subtraction.
 *
 *
 *
 * Example:
 *
 * Input: arr[] = {1, 2, 3, 4}
 *
 * Output: 3
 */


import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 1, 4, 3, 1};
        int total_elements = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = hm.getOrDefault(arr[i],0);
            hm.put(arr[i],val+1);
        }

        int max_frequency=0;

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>max_frequency){
                max_frequency= entry.getValue();
            }
        }

        System.out.println("The minimum number of operations required to make all elements equal is: "+(total_elements-max_frequency));

    }
}
