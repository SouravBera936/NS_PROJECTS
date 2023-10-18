/*Given an integer N. Print the value of PI with
 precision upto N decimal places.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14159265359;
        int N=sc.nextInt();
        System.out.printf("%."+N+"f\n",pi);
    }
}