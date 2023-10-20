/*Given a non-negative Integer x, check if this number is constant,
constant number is a number whose digits are all same.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String str=Integer.toString(N);
        int CurrentDigit=str.charAt(0);
        boolean isSame=true;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=CurrentDigit){
                isSame=false;
                break;
            }
        }
        if(isSame){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}