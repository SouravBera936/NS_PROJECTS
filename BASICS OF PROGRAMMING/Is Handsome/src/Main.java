/*Given a non- negative Integer x, check if this number is handsome,
handsome number is the number whose sum of digits is divisible by 2.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        while(N!=0){
            N=N%10;
            sum+=N;
            N/=10;
        }
        if(sum%2==0){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}