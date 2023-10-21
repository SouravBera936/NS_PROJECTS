/*Nowadays everyone loves watching series. Rahul has to attend his college exam
which will start in A minutes, but of course, watching series is a priority.
Every episode of the series that Rahul is watching, is 30 mins long.
If he starts watching a new episode now, will he finish watching it strictly before the exam starts?
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for (int i=1;i<=testcase;i++){
            int A=sc.nextInt();
            if(A<30){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}