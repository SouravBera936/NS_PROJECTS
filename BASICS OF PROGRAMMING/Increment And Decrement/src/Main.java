/*You must be familiar with various types of operators. One of the most commonly used operators in any language are
increment and decrement operators. Given two numbers X and Y.
Your task is to print the value of X decremented by 1 and value
of Y after incremented by 1.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        X--;
        Y++;
        System.out.println(X);
        System.out.println(Y);
    }
}