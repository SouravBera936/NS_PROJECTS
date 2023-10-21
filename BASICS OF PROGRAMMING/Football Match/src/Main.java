/*There is a football match between the home team and the away team.
Your task is to find which team wins based on the number of goals scored by each team.
 In case both teams scored equal goals then there is a "draw".
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        if(X>Y){
            System.out.println("home team");
        }else if(X<Y){
            System.out.println("away team");
        }else{
            System.out.println("draw");
        }
    }
}