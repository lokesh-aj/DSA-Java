package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void swpa(int[] arr2, int index1, int index2){
        int temp,a,b;

        a = arr2[index1];
        b= arr2[index2];
        temp = b;

        b = a;
        a = temp;

        arr2[index1] = a;
        arr2[index2] = b;

        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,4,6,8,10};

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter index number 1 : ");
        int index1 = sc.nextInt();
        System.out.println("Enter index number 2 : ");
        int index2 = sc.nextInt();

        swpa(arr, index1, index2);
    }
}
