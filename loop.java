
import java.util.Scanner;
public class loop {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of times:  ");
        int n = sc.nextInt();

        int a = 1;

        for (int i = 1; i <= n; i = i + 1) {
            System.out.println(a);
            a = a + 5;
        }

    }
}