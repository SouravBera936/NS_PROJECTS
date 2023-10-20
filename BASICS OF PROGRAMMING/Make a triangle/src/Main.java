/*Your task is to make a right-angled triangular array of natural numbers
by filling the rows of the triangle with consecutive numbers, starting with a 1 in the left corner.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=1;i<=N;i++){
            for (int j=i+1;j<=N;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}