package Arrays;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ways of creating an array.

        int[] arr = new int[5]; // Method 1
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        int[] arr2 = {1,2,3,4,5}; // Method 2

        //Ways of displaying array elements

        for(int i=0; i<arr.length; i++){// Method 1 : using for loop
            System.out.println(arr[i]);
        }

        for (int element : arr2) {// Method 2 : using for-each loop
            System.out.println(element);
        }





    }
}
