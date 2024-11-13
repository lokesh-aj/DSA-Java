package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {

        int[] arr = new int[nums.length*2];

        int ptr = -1;
        int ptr2 = arr.length/2-1;

        for (int i = 0; i < nums.length; i++) {
            ptr++;
            ptr2++;
            arr[ptr] = nums[i];
            arr[ptr2] = nums[i];
        }


        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        getConcatenation(nums);
    }
}
