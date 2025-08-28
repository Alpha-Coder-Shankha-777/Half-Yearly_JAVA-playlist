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