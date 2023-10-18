/*Given an integer n, For each i (1<=i<=n)
if i is even print "even" else print "odd".*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       for (int i=1;i<=N;i++){
           if(i%2==0){
               System.out.print("even"+" ");
           }else{
               System.out.print("odd"+" ");
           }
       }
    }
}