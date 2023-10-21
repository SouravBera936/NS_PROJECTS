/*Rahul has a sequence of three numbers, and he wants to determine if it is possible to rearrange
the sequence in such a way that it forms a strictly increasing sequence.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[3];
        for (int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]<arr[1] && arr[1]<arr[2]){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}