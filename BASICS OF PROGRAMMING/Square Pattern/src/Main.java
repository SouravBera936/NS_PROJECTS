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
            for (int j=1;j<=X;j++){
                if(i==1||i==X||j==1||j==X){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}