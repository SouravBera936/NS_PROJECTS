/*Write a program to check whether a number is positive, negative or zero using switch case.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        switch(N){
            case 1: System.out.println("Positive");
            break;
            case -1: System.out.println("Negative");
            break;
            default: System.out.println("Zero");
            break;
        }
    }
}