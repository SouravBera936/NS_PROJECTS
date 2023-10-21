/*Given a sequence of n non-negative integers, check if at least half of the elements of the sequence are divisible by 4.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N];
        int len=Math.abs(arr.length/2);
        int count=0;
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%4==0){
                count++;
            }
        }
        if(count>=len){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}