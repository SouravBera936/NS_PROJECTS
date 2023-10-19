/*Write a program to check whether a number is even or odd using switch case.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int result=N%2;
       switch (result){
           case 0: System.out.println("Even");
           break;
           default: System.out.println("Odd");
           break;
       }
    }
}