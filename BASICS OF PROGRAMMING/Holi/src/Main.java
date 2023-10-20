/*Newton wants to play Holi with his friends. So he wants to buy three colors for which he needs
some money from his father. For buying all three colors he needs at least 75 rupees.
For buying 2 colors he needs at least 50 rupees. For buying at least 1 color he needs 25 rupees.
You have to check how many colors did Newton buy. If he buys all three colors print "Newton is
very happy", if he buys only two colors print "Newton is happy", if he buys only one color print
"Newton is sad" otherwise print "Newton won't play Holi".
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        if(X<25){
            System.out.println("Newton won't play Holi");
        }else if(X>=25 && X<50){
            System.out.println("Newton is sad");
        }else if(X>=50 && X<75){
            System.out.println("Newton is happy");
        }else if(X>=75){
            System.out.println("Newton is very happy");
        }
    }
}