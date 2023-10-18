/*Given an integer n, your task is to print a
right-angle trianglepattern of consecutive numbers of height n.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       for (int i=1;i<=N;i++){
           for (int j=1;j<=i;j++){
               System.out.print(j+" ");
           }
           System.out.println();
       }
    }
}