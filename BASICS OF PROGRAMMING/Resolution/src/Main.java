/*The Parliament is currently discussing an important resolution. Where, N members voted.
 As per the constitution, a resolution is considered passed only if half or more of the
 members present vote in favor. Your task is to determine whether the resolution is passed or not.

Votes of N members are given as a binary string where '0' means voted against the resolution and '1'
 means voted in favor of the resolution.

 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int OneCount=0;
        int ZeroCount=0;
        String str=Integer.toString(N);
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==1){
                OneCount++;
            }else{
                ZeroCount++;
            }
        }
        if(ZeroCount<OneCount){
            System.out.println("true");
        }else if(ZeroCount>OneCount){
            System.out.println("false");
        }else if(ZeroCount==OneCount){
            System.out.println("true");
        }
    }
}