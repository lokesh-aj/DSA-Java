package Numbers;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,temp;

        System.out.println("Enter the values to swap : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Numbers before swapping : "+a+" "+b);

        temp = b;
        b = a;
        a = temp;
        System.out.println("Numbers after swapping : "+a+" "+b);
    }
}
