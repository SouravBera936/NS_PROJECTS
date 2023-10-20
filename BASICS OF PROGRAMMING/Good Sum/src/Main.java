/*Ram and Rahul were playing with dice, In one turn both of them roll their dice at once.
They consider it to be a Good Sum when the sum of the numbers on both of their dices is greater
than 8. You are given the numbers X and Y, which Ram and Rahul got in their particular turn,
and find whether it's a Good Sum or not.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for (int t=1;t<=testcase;t++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X+Y>8){
                System.out.println("Yes");
            }else{
                System.out.println("NO");
            }
        }
    }
}