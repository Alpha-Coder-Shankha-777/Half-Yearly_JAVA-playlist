import java.util.Scanner;
class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
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
    }
}
