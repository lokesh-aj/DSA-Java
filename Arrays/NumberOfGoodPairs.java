package Arrays;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }
        }
        return count / 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(arr));
        ;
    }
}
