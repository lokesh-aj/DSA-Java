package BinarySearch;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
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

    public static void main(String[] args) {
        int[] arr = {-18, -16, -5, 0,1,3,4,6,8,22,34,36,45,49,88};
        int target = 45;
        int ans = binarySearch(arr, target);

        if(ans==-1){
            System.out.println("Targeted value is not present in the array");
        }
        else{
            System.out.println("Index : "+ans);
        }
    }
}
