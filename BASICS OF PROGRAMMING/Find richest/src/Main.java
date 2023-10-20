/*Given the Income of three company employees, namely A, B, and C, Find the richest one.
Note: The income of all three employees is distinct.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A>B && A>C){
            System.out.println("A");
        }else if(B>A && B>C){
            System.out.println("B");
        }else if(C>A && C>B){
            System.out.println("C");
        }
    }
}