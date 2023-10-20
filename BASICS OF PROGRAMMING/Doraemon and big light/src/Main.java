/*Gian and Suneo want their heights to be equal so they asked Doraemon's help.
Doraemon gave a big light to both of them but the both big lights have different speed of magnifying.
 Let's assume the big light given to Gian can increase height of a person by v1 m/s
 and that of Suneo's big light is v2 m/s.
At the end of each second Doraemon check if their heights are equal or not.
Given initial height of Gian and Suneo, your task is to check whether the height of
Gian and Suneo will become equal at some point or not, assuming they both started at the same time.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h1=sc.nextInt();
        int h2=sc.nextInt();
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        for (int i=1;i<=10000;i++){
            h1+=v1*i;
            h2+=v2*i;
            if(h1==h2){
                System.out.println("Yes");
                break;
            }else{
                System.out.println("No");
            }
        }
    }
}