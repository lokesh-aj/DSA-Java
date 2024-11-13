package Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int ptr = 0;
        int ptr2 = n;

        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0){
                arr[i] = nums[ptr];
                ptr++;
            }
            else{
                arr[i] = nums[ptr2];
                ptr2++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }
}
