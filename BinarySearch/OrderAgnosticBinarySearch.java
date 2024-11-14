package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static int ascendingSearch(int[] arr, int target) {
        int start = 0; //index value 0
        int end = arr.length - 1; //index value 9

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;// if value not found in the array
    }

    public static int descendingSearch(int[] arr, int target) {
        int start = 0; //index value 0
        int end = arr.length - 1; //index value 9

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;// if value not found in the array
    }

    public static void orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {
            int ans = ascendingSearch(arr, target);
            if (ans == -1) {
                System.out.println("Value is not present in the array");
            } else {
                System.out.println("Index : " + ans);
            }
        } else if (arr[start] > arr[end]) {
            int ans = descendingSearch(arr, target);
            if (ans == -1) {
                System.out.println("Value is not present in the array");
            } else {
                System.out.println("Index : " + ans);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-18, -16, -5, 0, 1, 3, 4, 6, 8, 22, 34, 36, 45, 49, 88};//ascending sorted array
        int[] arr2 = {88, 49, 45, 36, 34, 22, 8, 6, 4, 3, 1, 0, -5, -16, -18};//ascending sorted array
        int target = 45;

        orderAgnosticBinarySearch(arr, target);
        orderAgnosticBinarySearch(arr2, target);
    }

}
