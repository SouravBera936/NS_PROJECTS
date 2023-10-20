/*Given a positive integer x, check if it is possible to break x in two numbers a and b such that :
1) a is odd and b is even.
2) The sum of a and b is equal to x.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N>=1 && (N-1)%2==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}