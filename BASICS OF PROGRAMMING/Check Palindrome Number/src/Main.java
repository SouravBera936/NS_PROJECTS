/*Given a number N, you need to check whether the given number is Palindrome or not.
A number is said to be Palindrome when it reads the
same from backward as forward.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int OriginalNum=N;
      int Reversednum=0;
      int remainder;
      while(N!=0){
        remainder=N%10;
        Reversednum=Reversednum*10+remainder;
        N/=10;
      }
      if(OriginalNum==Reversednum){
          System.out.println("True");
      }else{
          System.out.println("False");
      }
    }
}