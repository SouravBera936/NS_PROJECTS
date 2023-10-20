/*You are given an array "a" containing non- negative integers and an integer "k".
Your goal is to find the number of unique sets {i, j, k} where i < j < k, and the
sum of a[i], a[j], and a[k] is divisible by k.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[]arr=new int[N];
        for (int i=0;i<=N;i++){
            arr[i]=sc.nextInt();
        }
    }
}