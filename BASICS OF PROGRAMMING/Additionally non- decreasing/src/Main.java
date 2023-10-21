/*The objective is to check if a sequence of n non- negative integers
is non- decreasing, with the additional requirement that each element,
except the first one, should be at least 5 greater than the previous element.
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
        boolean flag=true;
        for (int i=1;i<N;i++){
            if(arr[i]<arr[i+1]+5){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}