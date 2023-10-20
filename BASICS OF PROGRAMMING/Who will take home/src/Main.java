/*Steve prefers even numbers that are multiples of 7, while Chris prefers odd numbers that are
multiples of 9 and William prefers those numbers that are not preferred by Steve and Chris both,
 If a number, represented as "n" is given, the task is to determine n is preferred by which person,
  Steve, Chris, or William.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0 && N%7==0){
            System.out.println("Steve");
        }else if(N%2!=0 && N%9==0){
            System.out.println("Chris");
        }else{
            System.out.println("William");
        }
    }
}