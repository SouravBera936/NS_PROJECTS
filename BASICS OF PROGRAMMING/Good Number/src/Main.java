/*You are given a number n, You have to tell if the number is good,
a good number is the number whose count of factors is prime.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        boolean flag=false;
        for (int i=1;i<=N;i++){
            if(N%i==0){
                count++;
            }
        }
        for (int j=2;j<count;j++){
            if(count%j==0){
                flag=true;
                break;
            }
        }
        if(flag==false && count!=1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}