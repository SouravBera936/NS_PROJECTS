/*Given marks of a student in 5 subjects. You need to find the grade that a student would get
on the basis of the average percentage obtained. Grades computed are as follows:
If the percentage is >= 80 then print Grade ‘A’
If the percentage is <80 and >=60 then print Grade ‘B’
If the percentage is <60 and >=40 then print Grade ‘C’
else print Grade ‘D’*/
import jdk.jfr.Percentage;

import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int markA=sc.nextInt();
       int markB=sc.nextInt();
       int markC=sc.nextInt();
       int markD=sc.nextInt();
       int markE=sc.nextInt();
       int Precentage=(markA+markB+markC+markE+markD)/5;
       System.out.println(Precentage);
       if (Precentage>=80){
           System.out.println("A");
       }else if(Precentage>=60 && Precentage<80){
           System.out.println("B");
       }else if(Precentage>=40 && Precentage<60){
           System.out.println("C");
       }else{
           System.out.println("D");
       }
    }
}