/*A manager's pay at a company is as follows:
If the manager's base pay is less than Rs. 1500, HRA and DA are equal to 10% and 90% of base pay respectively.
If his/her income is greater than or equal to Rs. 1500, HRA is equal to Rs. 500, and DA is equal to 98% of base pay.
 Write a program that determines the manager's gross salary, if his/her salary is inputted.
 [Gross Pay = Basic Salary + HRA + DA]*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for (int i=1;i<=testcase;i++){
            float PAY=sc.nextFloat();
            float HRA=0f;
            float DA=0f;
            if(PAY<=1500){
                HRA=HRA+((PAY*10)/100);
                DA=DA+((PAY*90)/100);
            }else if(PAY>1500){
                HRA=HRA+500;
                DA=DA+((PAY*98)/100);
            }
            float GPAY=(PAY+HRA+DA);
            System.out.printf("%.2f\n",GPAY);
        }
    }
}