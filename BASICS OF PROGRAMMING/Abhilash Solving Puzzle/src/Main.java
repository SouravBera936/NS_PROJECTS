/*Abhilash is solving a puzzle to crack a code. He gets a three-digit integer, if the integer satisfies all the following conditions then he will able to solve the puzzle:
The integer must be a positive number
The sum of all digits in the input number must be divisible by 3.
The input number must have an odd digit in the middle.

Find whether Abhilash will be able to crack the code or not.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        boolean IsPositive=true;
        boolean OddPresent=false;
        String str=Integer.toString(N);
        for (int i=0;i<str.length();i++){
            int digit=str.charAt(i)-'0';
            sum+=digit;
            if(str.charAt(i)<'0'){
                IsPositive=false;
                break;
            }
            if(str.charAt(str.length()/2)%2!=0){
                OddPresent=true;
            }
        }
        if(IsPositive && (sum%3==0) && OddPresent){
            System.out.println("code cracked");
        }else{
            System.out.println("better luck next time");
        }
    }
}