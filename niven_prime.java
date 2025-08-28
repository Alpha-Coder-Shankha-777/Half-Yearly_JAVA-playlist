import java.util.Scanner;
public class niven_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int counter = 0;
        int sum = 0;
        int copy = n;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        if (copy % sum == 0 && counter == 2)
        System.out.println("It is a niven prime number.");
        else 
        System.out.println("It is not a niven prime number.");
    }
}