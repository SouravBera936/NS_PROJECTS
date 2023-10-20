/*Newton is given two integers A and C such that A ≤ C.
Newton wants to find whether there exists any integer B such that A, B, and C are in arithmetic progression.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int C=sc.nextInt();
        int Mpoint=((A+C)/2);
        if((Mpoint-A)==(C-Mpoint)){
            System.out.println(Mpoint);
        }else{
            System.out.println("-1");
        }
    }
}