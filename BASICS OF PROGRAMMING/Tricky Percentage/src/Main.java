/*You are given N numbers, Your task is to calculate the percentage of even and odd numbers present
 among those N numbers, If the even percentage is greater then print "Even" with its percentage
 otherwise print "Odd" with its percentage. If in case both are having equal percentages then
  print "Tie" with either of their percentages.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N];
        int EvenCount=0;
        int OddCount=0;
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                EvenCount++;
            }else{
                OddCount++;
            }
        }
        if(EvenCount>OddCount){
            System.out.println("Even"+" "+(EvenCount*100)/N);
        }else if(EvenCount<OddCount){
            System.out.println("Odd"+" "+(OddCount*100)/N);
        }else if(EvenCount==OddCount){
            System.out.println("Tie"+" "+(EvenCount*100)/N);
        }
    }
}