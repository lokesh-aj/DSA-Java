import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Iterative approach
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();  // Number of terms to print in the Fibonacci sequence

        int a = 0, b = 1, temp;

        System.out.print("Fibonacci sequence: " + a + " " + b);

        // Start from i = 2 because the first two terms are already printed
        for (int i = 2; i <= n+1; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }

        //Recursive approach
//        System.out.println("Enter the number of terms: ");
//        int n = sc.nextInt();
//
//        System.out.println(fibonacci(n));

        sc.close();  // Close the scanner
    }
}
