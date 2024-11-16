package LinearSearch;
import java.util.*;
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            } else if (target<nums[mid]) {
                end = mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }
        }

        while(start<=end){
            if(nums[end]>target){
                end--;
            } else if (start==end) {
                start += 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,7));
    }
}
