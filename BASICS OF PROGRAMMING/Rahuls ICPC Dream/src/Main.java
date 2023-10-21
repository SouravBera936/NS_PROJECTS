/*Rahul has been working hard to compete in the ICPC World Finals. Rahul is ranked X
out of all contestants. However, only 10 contestants would be selected for the ICPC
World Finals. Check whether Rahul made it to the top 10 or not.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        if(X<=10){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}