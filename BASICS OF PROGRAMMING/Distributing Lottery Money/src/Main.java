/*Mahesh has won some money K from a lottery, he wants to distribute the money among his three sisters.
 His sisters already have some money with them. Let's say they have x, y, z amount of money.
 Now mahesh wants to distribute his money such that all the sisters have the same amount
 of total money left with them. Your task is to check if it is possible to distribute
 the money as Mahesh wants.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Z=sc.nextInt();
        int Total=K+X+Y+Z;
        if(Total%3==0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}