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
