package LinearSearch;

import java.util.Arrays;

public class TwoSumPart2 {
    public static int[] twoSum(int[] numbers, int target) {
       int start = 0;
       int end = numbers.length-1;

       while(start<end){
           if(numbers[start]+numbers[end] == target){
               return new int[]{start+1,end+1};
           } else if (numbers[start]+numbers[end]>target) {
               end--;
           } else if (numbers[start]+numbers[end]<target) {
               start++;
           }
       }
       return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4};

        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
}
