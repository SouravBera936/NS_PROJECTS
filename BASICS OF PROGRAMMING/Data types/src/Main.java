/*Some Data types are given below:-
Integer
Long
float
Double
char
Your task is to take input in the given format and print them in the same order.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int integer=sc.nextInt();
       long Long=sc.nextLong();
       float FL=sc.nextFloat();
       double DBL=sc.nextDouble();
       char C=sc.nextLine().charAt(0);
       System.out.println("Integer :" + integer);
       System.out.println("Long :"+Long);
       System.out.println("Float :"+FL);
       System.out.println("Double :"+DBL);
       System.out.println("Char :"+C);
    }
}