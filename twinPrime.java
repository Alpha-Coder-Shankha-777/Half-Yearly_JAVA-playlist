import java.util.Scanner;
class twinPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        int counter = 0, counter1 =0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) 
                counter++;
        }   
            for (int i = 1; i <= n2; i++){
                if (n2 % i == 0)
                counter1++;
            }
            if (counter == 2 & counter1 == 2 && Math.abs(n1 - n2)==2) 
                System.out.println("It is a twin prime number.");
            else
            System.out.println("It is not a twin prime number.");  
    }
}