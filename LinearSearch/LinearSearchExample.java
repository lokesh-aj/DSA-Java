package LinearSearch;

import java.util.Scanner;

public class LinearSearchExample {
    public static int linearSearch(int[] arr, int target) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 78, 20, 432, 90, 21, 23, 34, -1, 32, 67};

        int index = linearSearch(arr, 2);

        if (index == -1) {
            System.out.println("Targeted value not found in the array");
        } else {
            System.out.println("Targeted value is present at index :" + index);
        }
    }
}
