
import java.util.Scanner;
public class sum {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("The sum of the digits: "+sum);
        
        sc.close();
   }
   
}