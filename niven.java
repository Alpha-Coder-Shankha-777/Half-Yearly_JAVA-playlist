import java.util.Scanner; 
public class niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;
        int copy = n;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        if (copy % sum == 0) {
            System.out.println("Niven Number.");
        }else{
            System.out.println("Not a Niven number");
        }
    }
}