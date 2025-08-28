
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }

        if (sum == product) {
            System.out.println(num+ " is a Spy Number.");
        } else {
            System.out.println(num + " is NOT a Spy Number.");
        }
    }
}
