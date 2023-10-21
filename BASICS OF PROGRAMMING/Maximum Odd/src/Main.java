/*Rahul is given a sequence A consisting of N non-negative distinct integers.
Determine the maximum sum that we can get by adding two different elements
of A such that their sum is odd.
If it exists, print the maximum such number otherwise print -1.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int oddmax=Integer.MIN_VALUE;
        int evenmax=Integer.MIN_VALUE;
        for (int num:arr){
            if(num%2==0){
                evenmax=Math.max(evenmax,num);
            }else{
                oddmax=Math.max(oddmax,num);
            }
        }
        if(oddmax==Integer.MIN_VALUE || evenmax==Integer.MIN_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(oddmax+evenmax);
        }
    }
}