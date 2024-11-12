package Arrays;

import java.util.*;

public class ReverseArray {

    public static void reverse(int[] arr){

        int start,end; // two pointer that will be pointing from right to left and left to right in the array

        start = 0;
        end = arr.length-1;

//        System.out.println(arr[start]);
//        System.out.println(arr[end]);

        while(end>start){
            int a,b,temp; //same logic is implemented as of the swapping of elements in the array

            a = arr[start];
            b = arr[end];

            temp = b;
            b = a;
            a = temp;

            arr[start] = a;
            arr[end] = b;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,4,6,8,10};

        System.out.println(Arrays.toString(arr));

        reverse(arr);
    }
}
