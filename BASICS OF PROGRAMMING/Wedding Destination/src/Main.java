/*Rahul's wedding day has arrived, and he has invited both relatives and friends
to the celebration. However, a Total of A guests have arrived for his wedding,
which is more than he anticipated. To accommodate the guests, Rahul has arranged a
 certain number of cars, X amount of 4 seaters cars and Y amount of 8 seaters cars
  to transport them to the wedding destination. He asked for the maximum number of
  guests that can travel together in these cars to reach the destination. Your task
  is to calculate the count of guests who are left without transportation. This will
  help Rahul understand the number of guests he needs to make alternative arrangements for.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int TotalSeatAvialable=(X*4)+(Y*8);
        if(TotalSeatAvialable>A){
            System.out.println("0");
        }else{
            System.out.println(A-TotalSeatAvialable);
        }
    }
}