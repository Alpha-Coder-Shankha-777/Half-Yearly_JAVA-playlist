

===== DigitProduct.java =====


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
 



===== PerfectNumber.java =====

import java.util.Scanner;
class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum, i;
        

        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        sum = 0; 
        
      
        for (i = 1; i < n; i++) {
            if (n % i == 0) {     
                sum = sum + i;    
            }
        }
        
 
        if (sum == n)
            System.out.println(n + " is a Perfect Number.");
        else
            System.out.println(n + " is not a Perfect Number.");
    }
}



===== SpyNumber.java =====


import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }

        if (sum == product) {
            System.out.println(num+ " is a Spy Number.");
        } else {
            System.out.println(num + " is NOT a Spy Number.");
        }
    }
}



===== abundant.java =====


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




===== armstrong.java =====


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







===== automorphic.java =====

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



===== coprime.java =====

import java.util.Scanner;

public class coprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = 1; 

        // Find GCD by checking all common divisors
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // store highest common divisor found
            }
        }

        if (gcd == 1) {
            System.out.println("It is a co-prime number.");
        } else {
            System.out.println("It is not a co-prime number.");
        }
    }
}



===== digit_counter.java =====

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



===== extract_digits.java =====


import java.util.Scanner;
public class extract_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        while (n!= 0) {
            int digit = n % 10;

            System.out.print(digit+" ,");
            n = n /10;
        }
    }
}


===== factorial.java =====


import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }

        System.out.println("The factorial of the number "+num+" is: "+factorial);
    }
}


===== fibonacci.java =====


import java.util.Scanner;
class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("\nFibonacci series:");
        System.out.print(" 0, 1, ");
        int a = 0, b = 1 , c = 0;

        for (int i = 1; i <= (n - 2); i ++) {
            c = a + b;
            System.out.print(c+", ");
            a = b;
            b = c;
            if (i < n) {
                System.out.print(" ,");
            }
        }
    }
}






===== lead.java =====


import java.util.Scanner;

public class lead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int copy = num;
        int sumEven = 0, sumOdd = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                sumEven = sumEven + digit;
            } else {
                sumOdd = sumOdd + digit;
            }

            num /= 10;
        }

        if (sumEven == sumOdd) {
            System.out.println(copy + " is a Lead Number.");
        } else {
            System.out.println(copy + " is NOT a Lead Number.");
        }

        sc.close();
    }
}



===== loop.java =====


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


===== neon.java =====


import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int square = num * num;
        int sum = 0;
        
        while (square != 0) {
            sum = sum + square;
            sum = sum % 10; 
            square = square / 10;       
        }
        
        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is NOT a Neon Number.");
        }
    }
}




===== niven.java =====

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


===== niven_prime.java =====

import java.util.Scanner;
public class niven_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int counter = 0;
        int sum = 0;
        int copy = n;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        if (copy % sum == 0 && counter == 2)
        System.out.println("It is a niven prime number.");
        else 
        System.out.println("It is not a niven prime number.");
    }
}


===== palindrome.java =====

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int copy = n;
        int reverse = 0;

        while (n!= 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (copy == reverse) {
            System.out.println(copy+ " is a palindrome number.");
        }else{
            System.out.println(copy+" is not a palindrome number.");
        }
    }
}    




===== palindromePrimeChecker.java =====

import java.util.Scanner;
public class palindromePrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int counter1 = 0, rev1 = 0, copy = n;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter1++;
            }
        }
        while (n != 0) {
            int digit1 = n % 10;
            rev1 = rev1 * 10 + digit1;
            n = n / 10;
        }
        if (copy == rev1 && counter1 == 2)
            System.out.println("It is a palindrome prime number.");
        else
            System.out.println("It is not a palindrome prime number.");
        
    }
}


===== prime.java =====

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


===== print_counter.java =====


class print_counter {
    public static void main (String[] args) {
        int c = 10;
        for (int i = 1; i<=10; i++) {
            System.out.print(i+", ");
            c++;
        }
        System.out.println("The value of counter is: "+c);
    }
}


===== reverse.java =====

import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n /10;
        }
        System.out.println("The reversed number is: "+rev);
    }
}



===== specialNumber.java =====

import java.util.Scanner;
class special {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, original, digit, factorial, sum, i;
        
       
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        original = n;
        sum = 0;
        
       
        while (n > 0) {
            digit = n % 10;    
            
           
            factorial = 1;
            for (i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            
            sum = sum + factorial; 
            n = n / 10;           
        }
        
       
        if (sum == original)
            System.out.println(original + " is a Special Number.");
        else
            System.out.println(original + " is not a Special Number.");
    }
}


===== sum.java =====


import java.util.Scanner;
public class sum {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("The sum of the digits: "+sum);
        
        sc.close();
   }
   
}


===== switchNumberLogic.java =====


import java.util.Scanner;
class switchNumberLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for automorphic number check.\nEnter 2 for Palindrome number.\nEnter 3 for Fibnoinacci number.\nEnter your choice : ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter a number : ");
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
            break;

            case 2:
                System.out.println("Enter a number : ");
                int num = sc.nextInt();
                int reversed = 0;
                int original = num;

                while (num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num = num / 10;
                }

                if (original == reversed) {
                    System.out.println("It is a palindrome number");
                } else {
                    System.out.println("It is not a palindrome number");
                }
            break;

            case 3:
                System.out.println("Enter a number : ");
                int f = sc.nextInt();
                int a = 0, b = 1, c;

                System.out.print("Fibonacci Series: " + a + " " + b);

                for (int i = 2; i < f; i++) {
                    c = a + b;
                    System.out.print(" " + c);
                    a = b;
                    b = c;
                }
            break;

            default:
                System.out.println("Invalid choice");
            }
        }
    }




===== tribonacciNumber.java =====

import java.util.Scanner;
class tribonacciNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, first, second, third, next;
        boolean isTribonacci;
        
   
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
     
        if (n == 0 || n == 1) {
            System.out.println(n + " is a Tribonacci Number.");
            System.exit(0);
        }
        
     
        first = 0;
        second = 0;
        third = 1;
        isTribonacci = false;
        
        while (third < n) {
            next = first + second + third; 
            first = second;                
            second = third;                
            third = next;                 
            
            if (third == n) {              
                isTribonacci = true;
                break;
            }
        }
        

        if (isTribonacci)
            System.out.println(n + " is a Tribonacci Number.");
        else
            System.out.println(n + " is not a Tribonacci Number.");
    }
}


===== twinPrime.java =====

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


===== twistedDuck.java =====

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



===== twisted_prime.java =====

import java.util.Scanner;
public class twisted_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
            counter++;
        }
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        int counter1 = 0;
        for (int i = 1; i <= rev; i++) {
            if (rev % i == 0)
            counter1++;
        }
        if (counter1 == 2 && counter == 2)
        System.out.println("It is a twisted prime number.");
        else
        System.out.println("It is not a twisted prime number.");

    }
}


===== volume_Switch.java =====


import java.util.Scanner;
class volume_Switch {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Press 1 to calculate the volume of Cube.\n Press 2 to calculate the volume of Cuboid. \n Press 3 to calculate the volume of Sphere");
        
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: System.out.println("Enter the side of Cube: ");
            int s = sc.nextInt();
            int cube = s * s * s;
            System.out.println("The volume of cube is: "+cube);

            break;

            case 2: System.out.println("Enter the length, breadth, height of cuboid: ");
            int l = sc.nextInt();
            int b = sc.nextInt();
            int h = sc.nextInt();
            int cuboid = l * b * h;
            System.out.println("The volume of cuboid is: "+cuboid);

            break;

            case 3: System.out.println("Enter the radius of sphere");
            double r = sc.nextDouble();
            double sphere = 4.0/3.0 * 3.14 * r * r;
            System.out.println("The volume of sphere is: "+sphere);
            
            break;
            
            default:

            System.out.println("Wrong Choice!!");
            
            sc.close();


        }
    }
}
