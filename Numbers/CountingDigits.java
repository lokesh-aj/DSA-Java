package Numbers; /**
 Whenever something is related to digits or numbers, we will check the remainder and the quotient.

 num%10 ....(num is given)....(num%10 will give the remainder, which is going to be the last digit of the number)
 num/10 ....(num is given)....(num/10 will give the quotient)
 */
import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int counter = 0;

        while(num>0){
            num = num/10;
            counter++;
        }

        System.out.println(counter);


    }
}
