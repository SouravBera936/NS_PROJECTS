/*Given an integer N, your task is to print all the even
integer from 1 to N.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       for(int i=1;i<=N;i++){
           if(i%2==0){
               System.out.println(i+" ");
           }
       }
    }
}