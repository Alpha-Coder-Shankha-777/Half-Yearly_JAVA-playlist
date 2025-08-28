import java.util.Scanner;
class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % 1 == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("Prime Number.");
        }else{
            System.out.println("Composite Number");
        }
    }
}