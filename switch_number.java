// WRITE A MENU DRIVEN PROGRAM TO CHECK A NUMBER WITH THE FOLLOWING NUMBER LOGIC CONDITIONS:
// case 1: Palindrome prime
// case 2: Twin prime
// case 3: Twisted prime
// case 4: Duck prime
import java.util.Scanner;
public class switch_number {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.println("Enter 1 for Palindrome prime.\n 2 for twin prime.\n 3 for twisted prime.\n 3 for duck prime.\nEnter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: 
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
            break;
            
            case 2: 
                 System.out.print("Enter first number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                int count1 = 0, count2 = 0;

        
                for (int i = 1; i <= num1; i++) {
                    if (num1 % i == 0) {
                    count1++;
            }
        }

      
                for (int i = 1; i <= num2; i++) {
                    if (num2 % i == 0) {
                    count2++;
            }
        }

            if (count1 == 2 && count2 == 2 && (num1 - num2 == 2 || num2 - num1 == 2)) {
            System.out.println("The two numbers are Twin Primes.");
            } else {
            System.out.println("The two numbers are NOT Twin Primes.");
            }
            break;

            case 3: 
                System.out.println("Enter a nummber: ");
                int no = sc.nextInt();
                





