/*Given a sequence of 5 integers, a, b, c, d, and e, Check if the sum of all 5 integers is even.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        if(sum%2==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}