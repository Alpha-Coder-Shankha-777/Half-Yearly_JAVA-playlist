# Half-Yearly_JAVA-playlist
All JAVA codes which would come in Half Yearly exam of class IX

//ABUNDANT NUMBER


import java.util.Scanner;
public class abundant {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i  = 1; i <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;

            }
        }
        
        if (sum > num) {
            System.out.println("It is an abundant Number.");
        }else{
            System.out.println("It is not an abundant number.");
        }
    }
}

//ARMSTRONG NUMBER


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




//AUTOMORPHIC NUMBER

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
