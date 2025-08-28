
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int counter = 0;
        int s = 0;

     
        while (temp != 0) {
            counter++;
            temp = temp / 10;
        }

        temp = num; 
        while (temp != 0) {
            int digit = temp % 10;
            s = s + (int) Math.pow(digit, counter);
            temp = temp / 10;
        }

        if (s == num) {
            System.out.println("Armstrong number,");
        }else{
            System.out.println("Not an armstrong number.");
        }
    }
}




