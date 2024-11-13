package Arrays;

import java.util.Arrays;

public class SmallerThanCurrentElement {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int currentElement = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    if(nums[j]<currentElement){
                        count++;
                    }
                }
            }

            arr[i] = count;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,4,8};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
