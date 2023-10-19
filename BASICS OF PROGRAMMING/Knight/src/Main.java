/*Given an 8*8 empty chessboard in which a knight is placed at a position (X, Y).
Your task is to find the number of positions in the chessboard
knight can jump into in a single move .
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int ans=0;
        if(X-1>=1 && Y-2>=1){
            ans=ans+1;
        }
        if(X+1<=8 && Y-2>=1){
            ans=ans+1;
        }
        if(X-1>=1 && Y+2<=8){
            ans=ans+1;
        }
        if(X+1<=8 && Y+2<=8){
            ans=ans+1;
        }
        if(X+2<=8 && Y+1<=8){
            ans=ans+1;
        }
        if(X+2<=8 && Y-1>=1){
            ans=ans+1;
        }
        if(X-2>=1 && Y+1<=8){
            ans=ans+1;
        }
        if(X-2>=1 && Y-1>=1){
            ans=ans+1;
        }
        System.out.println(ans);
    }
}