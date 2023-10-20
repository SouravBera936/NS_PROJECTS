/*Given an integer N, you have to print the given below pattern for N ≥ 3.
Example
Pattern for N = 4
*
*^*
*^^*
*****
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("*");
        for (int i=1;i<N-1;i++){
            System.out.print("*");
            for (int j=1;j<=i;j++){
                System.out.print("^");
            }
            System.out.println("*");
        }
        for (int i=0;i<=N;i++){
            System.out.print("*");
        }
    }
}