/*Chef appeared for an exam consisting of 3 sections. Each section is worth 100 marks.
Chef scored A marks in Section 1, B marks in section 2, and C marks in section 3.
Chef passes the exam if both of the following conditions satisfy:
Total score of Chef is ≥ 100;
Score of each section ≥ 10;
Determine whether Chef passes the exam or not.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=1;i<=t;i++){
            int markA=sc.nextInt();
            int markB=sc.nextInt();
            int markC=sc.nextInt();
            if((markA+markB+markC)>=100 && markA>=10 && markB>=10 && markC>=10){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
        }
    }
}