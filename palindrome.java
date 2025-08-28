import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int copy = n;
        int reverse = 0;

        while (n!= 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (copy == reverse) {
            System.out.println(copy+ " is a palindrome number.");
        }else{
            System.out.println(copy+" is not a palindrome number.");
        }
    }
}    
