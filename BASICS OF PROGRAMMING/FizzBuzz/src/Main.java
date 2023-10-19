/*Given a number N for each I (1 < = I < = N), you have to print the number except:-
For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number.
For numbers that are multiples of both 3 and 5, print "FizzBuzz" instead of the number.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       for(int i=1;i<=N;i++){
           if(i%3==0 && i%5==0){
               System.out.print("FizzBuzz"+" ");
           }else if(i%3==0){
               System.out.print("Fizz"+" ");
           }else if(i%5==0){
               System.out.print("Buzz"+" ");
           }else{
               System.out.print(i+" ");
           }
       }
    }
}