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