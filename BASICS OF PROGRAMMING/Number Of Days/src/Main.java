/*Given the month number, your task is to calculate the number of days present in that particular month.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        if(M==1||M==3||M==5||M==7||M==8||M==10||M==12){
            System.out.println("31");
        }else if(M==2){
            System.out.println("28");
        }else{
            System.out.println("30");
        }
    }
}