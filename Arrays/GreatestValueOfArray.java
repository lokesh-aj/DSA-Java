package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestValueOfArray {
    public static void Greatest(int[] arr2){
        int greatest = arr2[0];

        for (int i = 1; i < arr2.length; i++) {
            if(arr2[i]>greatest){
                greatest = arr2[i];
            }
        }

        System.out.println("Greatest value of the array : "+greatest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {2,4,6,8,10};
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value");
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is : "+ Arrays.toString(arr));
        Greatest(arr);
    }
}
