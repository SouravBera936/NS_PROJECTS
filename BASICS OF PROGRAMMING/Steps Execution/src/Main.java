/*Input a number N, add 8 to it and then divide it by 3,
 take the modulus of the resulting value with 5 and then
 finally multiply it by 5. Display the final value of N.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        N=(((N+8)/3)%5)*5;
        System.out.println(N);
    }
}