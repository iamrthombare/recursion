 /*Recursive Fibonacci */
import java.util.*;
 class R_Fibonacci{
   int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the num");
     int n = sc.nextInt();

       R_Fibonacci obj = new R_Fibonacci();

        for (int i = 0; i < n; i++) {
            System.out.print(obj.fib(i) + " ");
        }
   }
 }
