/*In your programming class, you learned a basic concept of loops, So to test your skills your father asked you to print the multiplication table of N. The format of printing is:
For Example, N over here is 8
8 x 1 = 8
8 x 2 = 16
....
8 x 10 = 80
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(N+" "+"X"+" "+i+"="+" "+N*i);
        }

    }
}