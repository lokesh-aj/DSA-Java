import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();  // Number of terms to print in the Fibonacci sequence

        int a = 0, b = 1, temp;

        System.out.print("Fibonacci sequence: " + a + " " + b);

        // Start from i = 2 because the first two terms are already printed
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }

        sc.close();  // Close the scanner
    }
}
