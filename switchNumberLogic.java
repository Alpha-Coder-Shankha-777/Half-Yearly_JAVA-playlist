
import java.util.Scanner;
class switchNumberLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for automorphic number check.\nEnter 2 for Palindrome number.\nEnter 3 for Fibnoinacci number.\nEnter your choice : ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter a number : ");
                int n = sc.nextInt();
                int sq = n * n;
                int counter = 0;
                int copy = n;
                
   
                while (n != 0) {
                    n = n / 10;
                    counter++;
                }

                int power = (int)Math.pow(10, counter);

                if (sq % power == copy) {
                    System.out.println("It is an automorphic number");
                }else{
                    System.out.println("It is not an automorphic number");
                }
            break;

            case 2:
                System.out.println("Enter a number : ");
                int num = sc.nextInt();
                int reversed = 0;
                int original = num;

                while (num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num = num / 10;
                }

                if (original == reversed) {
                    System.out.println("It is a palindrome number");
                } else {
                    System.out.println("It is not a palindrome number");
                }
            break;

            case 3:
                System.out.println("Enter a number : ");
                int f = sc.nextInt();
                int a = 0, b = 1, c;

                System.out.print("Fibonacci Series: " + a + " " + b);

                for (int i = 2; i < f; i++) {
                    c = a + b;
                    System.out.print(" " + c);
                    a = b;
                    b = c;
                }
            break;

            default:
                System.out.println("Invalid choice");
            }
        }
    }
