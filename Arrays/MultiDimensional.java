package Arrays;

import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];// Method 1
        for(int row=0; row< arr.length; row++){
            for(int col=0; col< arr.length;col++){
                arr[row][col] = row*col*2;
            }
        }

        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; // Method 2


        //Displaying Values
        for(int row=0; row< arr.length; row++){
            for(int col=0; col< arr.length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int row=0; row< arr2.length; row++){
            for(int col=0; col< arr2.length;col++){
                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }

    }
}
