/* Recursive sum of natural numbers */
import java.util.*;

class s_natural {

    public static int s_nat(int a) {
        if (a == 0)
            return 0;

        return a + s_nat(a - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num ");
        int n = sc.nextInt();

        System.out.println("Sum: " + s_nat(n));

        
    }
}
