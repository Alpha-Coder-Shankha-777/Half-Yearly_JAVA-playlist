
import java.util.Scanner;
public class abundant {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i  = 1; i <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;

            }
        }
        
        if (sum > num) {
            System.out.println("It is an abundant Number.");
        }else{
            System.out.println("It is not an abundant number.");
        }
    }
}

