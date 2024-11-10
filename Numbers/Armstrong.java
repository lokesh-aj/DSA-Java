package Numbers;

import java.util.Scanner;

public class Armstrong {

    public static Boolean armstrong(int num){
        int temp, digits;
        digits=0;
        temp=num;
        while(temp>0){
            digits = digits+((temp%10)*(temp%10)*(temp%10));
            temp = temp/10;
        }
        
        if(digits==num){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the number:");
        num = sc.nextInt();

        if(armstrong(num) == true){
            System.out.println("The number is an armstrong number");
        } else if (armstrong(num) != true) {
            System.out.println("The number is not an armstrong number");

        }
    }
}
