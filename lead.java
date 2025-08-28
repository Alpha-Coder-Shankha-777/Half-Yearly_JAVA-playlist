
import java.util.Scanner;

public class lead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int copy = num;
        int sumEven = 0, sumOdd = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                sumEven = sumEven + digit;
            } else {
                sumOdd = sumOdd + digit;
            }

            num /= 10;
        }

        if (sumEven == sumOdd) {
            System.out.println(copy + " is a Lead Number.");
        } else {
            System.out.println(copy + " is NOT a Lead Number.");
        }

        sc.close();
    }
}
