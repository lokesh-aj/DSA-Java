package Arrays;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int start,end;
        start = -1;
        end = -1;

        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){
                if(start!=-1){
                    end = i;
                }
                else{
                    start = end = i;
                }
            }
        }

        arr[0] = start;
        arr[1] = end;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 0;

        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
}
