/*Given a number x, check whether it is a pretty number. the pretty number is the number that is divisible by both 2 and 3.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        if(X%2==0 && X%3==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}