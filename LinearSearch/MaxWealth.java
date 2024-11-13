package LinearSearch;

public class MaxWealth {
    public static int maximumWealth(int[][] accounts){
        int richest = 0;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }

            if (sum > richest) {
                richest = sum;
            }
        }

        return richest;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,5,3}, {3,2,6}};

        System.out.println(maximumWealth(arr));;
    }
}
