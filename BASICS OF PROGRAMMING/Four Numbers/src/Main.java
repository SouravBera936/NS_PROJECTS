/*Given four numbers A, B, C, D. Find the maximum number of pairs that can be made.
(each pair consist of two distinct numbers). Each number can be used only once.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        int count=2;
        if((A==B && B==C)||(B==C && C==D)||(C==D && D==A)||(A==C && C==D)){
            count=1;
        }else if (A==B && B==C && C==D){
            count=0;
        }
        System.out.println(count);
    }
}