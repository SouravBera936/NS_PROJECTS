/*Newton calls that number a Newton Number if that number's cube root is divisible
 by both 5 and 2. Your task is to find whether the given number N is a Newton Number
 or not. Print Yes, if it's a Newton Number otherwise print No.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double N=sc.nextDouble();
       double Num=Math.cbrt(N);
        if(Num%5==0 && Num%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}