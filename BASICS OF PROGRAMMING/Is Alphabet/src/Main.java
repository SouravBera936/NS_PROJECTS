/*Write a program to check whether character is an alphabet or not using conditional operator.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
       if(ch>='a' && ch<='z'){
           System.out.println("False");
       }else if(ch>='A' && ch<='Z'){
           System.out.println("True");
       }
    }
}