/*Given a sequence of three integers, check if the product of all these numbers is divisible by 20.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       int C=sc.nextInt();
       int Product=A*B*C;
       if(Product%20==0){
           System.out.println("True");
       }else{
           System.out.println("False");
       }
    }
}