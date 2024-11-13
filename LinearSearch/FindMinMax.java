package LinearSearch;

public class FindMinMax {
    public static void findMinMax(int[] arr) {
        int min, max;
        min = arr[0];
        max = arr[0];

        //For finding minimum value in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        //For finding maximum value in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum Value : " + min);
        System.out.println("Maximum Value : " + max);
    }

    public static void main(String[] args) {
        int[] arr = {12, 78, 20, 432, 90, 21, 23, 34, -1, 32, 67};

        findMinMax(arr);
    }
}
