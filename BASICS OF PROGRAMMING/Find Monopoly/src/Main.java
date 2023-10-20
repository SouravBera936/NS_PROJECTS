/*We have four companies in the market, namely A, B, C, and D.
Their profits for this year are P lakh, Q lakh, R lakh, and S lakh rupees respectively.
Our goal is to determine if any single company's profit surpasses the total profits of
the remaining companies, indicating a monopoly situation in the market.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int P=sc.nextInt();
       int Q=sc.nextInt();
       int R=sc.nextInt();
       int S=sc.nextInt();
       if((P>Q+R+S)||(Q>P+R+S)||(R>P+Q+S)||(S>P+Q+R)){
           System.out.println("true");
       }else{
           System.out.println("No");
       }
    }
}