/*Given two elements A and B, your task is to swap the given two elements.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       System.out.println("A :" +A+ "B:"+B);
       System.out.println((A+B)-A);
       System.out.println((A+B)-B);
    }
}