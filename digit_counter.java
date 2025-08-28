import java.util.Scanner;
public class digit_counter {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int counter = 0;
        while (n != 0) {
            n = n / 10;
            counter = counter + 1;
        }

        System.out.println("Number of digits: "+counter);

        sc.close();
    }
}
