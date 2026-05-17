/* Recursive power calculation */
import java.util.*;

class pow_cal{

   public static int pow(int a , int b){
     if(b==0){
       return 1;
     }
     return a * pow(a,b-1);
   }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num");
    int num = sc.nextInt();
    System.out.println("Ente r the power");
    int p = sc.nextInt();

    System.out.print("Power of num:"+pow(num,p));

  }

}
