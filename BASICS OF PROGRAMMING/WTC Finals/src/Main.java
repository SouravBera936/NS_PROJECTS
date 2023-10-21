/*here is a cricket test match going on between two teams India and Australia.
India is batting second and got a target of X runs. Currently, India has scored Y runs.
Determine how many more runs India should score to win the Finals.
Note: The target score in cricket matches is one more than the number of runs scored
by the team that batted first.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for (int i=1;i<=testcase;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int Diff=X-Y;
            System.out.println(Diff);
        }
    }
}