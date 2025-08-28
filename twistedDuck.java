import java.util.Scanner;

public class twistedDuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int rev = 0, copy = num;

     
        while (copy != 0) {
            rev = rev * 10 + copy % 10;
            copy = copy /10;
        }

      
        boolean isDuck = false;
        while (rev != 0) {
            int digit = rev % 10;
            if (digit == 0) {
                isDuck = true;
                break;
            }
            rev = rev / 10;
        }

        if (isDuck)
            System.out.println("twisted duck");
        else
            System.out.println("not a twisted duck");
    }
}
