/* Recursive decimal to binary */
import java.util.*;
class dec_to_binay{

  public static void dtob(int n ){
    if(n==0){
      return  ;

    }
     dtob(n/2);
    System.out.print(n%2);
  }
  public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
      System.out.println("Enter the num");
      int n = sc.nextInt();
      if(n==0){
        System.out.print("0");
      }else{
        dtob(n);
      }
  }

}
