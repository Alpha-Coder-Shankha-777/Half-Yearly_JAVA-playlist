import java.util.Scanner;

public class coprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = 1; 

        // Find GCD by checking all common divisors
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // store highest common divisor found
            }
        }

        if (gcd == 1) {
            System.out.println("It is a co-prime number.");
        } else {
            System.out.println("It is not a co-prime number.");
        }
    }
}
