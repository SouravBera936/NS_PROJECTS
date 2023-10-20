/*Rahul is training to become a 100m athletic champion. His coach records his
running timings using a stopwatch with a single button. Pressing the button alternates
between starting and stopping the stopwatch's timer. When the timer is running, it
increases by 1 every second. Initially, the stopwatch is stopped, and the timer reads 0 seconds.
You are given a sequence of times when the stopwatch button is pressed. Your task is to determine
what the stopwatch's timer displays if it is stopped at the end of the sequence. If the stopwatch
is still running, output "Run Champ" to motivate Rahul.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N];
        for (int i=0;i<=N;i++){
            arr[i]=sc.nextInt();
        }
        int time=0;
        for(int i=0;i<N;i+=2){
            if(i+1<N){
                time+=(arr[i+1]-arr[i]);
            }else{
                System.out.println("Run Champ");
                return;
            }
        }
        System.out.println(time);
    }
}