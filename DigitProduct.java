
import java.util.Scanner;
public class DigitProduct {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt(); 

        int product = 1;
        

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;

        }
        System.out.println("Product: "+product);

        if (product % 2 == 0 ) {
            System.out.println("Product is even.");
        }else{
            System.out.println("Product is odd.");
        }
    }

}
 
