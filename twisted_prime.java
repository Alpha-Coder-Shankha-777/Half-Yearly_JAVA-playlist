import java.util.Scanner;
public class twisted_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
            counter++;
        }
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        int counter1 = 0;
        for (int i = 1; i <= rev; i++) {
            if (rev % i == 0)
            counter1++;
        }
        if (counter1 == 2 && counter == 2)
        System.out.println("It is a twisted prime number.");
        else
        System.out.println("It is not a twisted prime number.");

    }
}