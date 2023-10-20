/*Ram is given an array A of length N, Ram can right-rotate the array any number of times
(possibly zero times also). His task is to find out the maximum value of A1 + AN.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for (int t=1;t<=testcase;t++){
            int N=sc.nextInt();
            int[]arr=new int[N];
            int maxsum=Integer.MIN_VALUE;
            for (int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                int CurrentSum=arr[0]+arr[N-1];
                if(CurrentSum>maxsum){
                    maxsum=CurrentSum;
                }
                int temp=arr[N-1];
                for (int j=N-1;j>=1;j--){
                    arr[j]=arr[j-1];
                }
                arr[0]=temp;
            }
            System.out.println(maxsum);
        }
    }
}