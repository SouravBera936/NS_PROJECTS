/*A number s called rare if all of its digits are divisible by K.
Given a number N your task is to check if the given number is rare or not.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        Boolean israre=true;
        while(N!=0){
            N=N%10;
            if(N%K==0){
                israre=true;
            }else{
                israre=false;
            }
            N/=10;
        }
        if(israre){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
