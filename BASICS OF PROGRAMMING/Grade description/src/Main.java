/*Given the grade of a student in a major project, determine and print the equivalent description for that grade.
Description of grades:-
A+ - > outstanding
A - > excellent
B+ - > very good
B - > good
C+ - > fair
C - > satisfactory
D - > needs improvement
F - > fail
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        if(st.equals("A+")){
            System.out.println("outstanding");
        }
        else if(st.equals("A")){
            System.out.println("excellent");
        }
        else if(st.equals("B+")){
            System.out.println("very good");
        }
        else if(st.equals("B")){
            System.out.println("good");
        }
        else if(st.equals("C+")){
            System.out.println("fair");
        }
        else if(st.equals("C")){
            System.out.println("satisfactory");
        }
        else if(st.equals("D")){
            System.out.println("needs improvement");
        }
        else if(st.equals("F")){
            System.out.println("fail");
        }

    }
}