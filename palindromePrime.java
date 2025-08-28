import java.util.Scanner;
public class palindromePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
                int n = sc.nextInt();
                int count = 0;

                for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
                int copy = n, reverse = 0;
                for (; copy > 0; copy /= 10) {
                int digit = copy % 10;
                reverse = reverse * 10 + digit;
                }
                if (count == 2 && reverse == n) {
                System.out.println("It is a palindrome prime number.");
                }else{
                System.out.println("It is not a palindrome prime number.");
            }
    }
}