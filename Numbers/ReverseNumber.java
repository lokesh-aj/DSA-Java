package Numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        while(num>0){
            System.out.print(num%10);
            num = num/10;
        }
    }
}
