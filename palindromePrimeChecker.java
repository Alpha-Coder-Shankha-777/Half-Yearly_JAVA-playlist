import java.util.Scanner;
public class palindromePrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int counter1 = 0, rev1 = 0, copy = n;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter1++;
            }
        }
        while (n != 0) {
            int digit1 = n % 10;
            rev1 = rev1 * 10 + digit1;
            n = n / 10;
        }
        if (copy == rev1 && counter1 == 2)
            System.out.println("It is a palindrome prime number.");
        else
            System.out.println("It is not a palindrome prime number.");
        
    }
}