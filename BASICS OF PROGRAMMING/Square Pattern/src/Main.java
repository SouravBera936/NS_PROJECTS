/*Perform the loop operation to create a square pattern for the given number of rows.

Example
number of rows = 5
*****
* *
* *
* *
*****
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        for (int i=1;i<=X;i++){
            System.out.print("*");
            for (int j=1;j<=X-2;j++){
                System.out.println("* *");
            }
            System.out.println();
        }
    }
}