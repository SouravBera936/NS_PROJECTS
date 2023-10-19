/* Given two integers a and b, your task is to check following conditions:-
1. If a <= 10 and b >= 10 (Logical AND).
2. Atleast one from a or b will be even (Logical OR).
3. if a is not equal to b (Logical NOT).
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A<=10 && B>=10){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(A%2==0 || B%2==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(A!=B){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}