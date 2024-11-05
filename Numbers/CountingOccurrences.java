package Numbers;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int user_input = sc.nextInt();

        int num = user_input;


        System.out.println("Find the occurrence for the digit : ");
        int digit = sc.nextInt();

        int counter = 0;

        while(num>0){
            if(digit == num%10){
                counter++;
            }
            num = num/10;
        }

        System.out.println("The occurrence of the digit "+digit+" in the number "+user_input+ " is "+counter);
    }
}
