/*Given a positive integer N, your task is to print a Pyramid pattern of '*' of height N.

For N = 5, the following pattern is printed.
   *

  ***

 *****

*******

*********
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=1;i<=N;i++){
            for (int j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}