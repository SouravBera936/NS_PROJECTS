/*Given three side lengths a, b, and c, check whether a triangle is equilateral, scalene or isosceles triangle.
NOTE:
Equilateral triangle: All sides and angles are equal.
Isosceles triangle: Two sides and two angles are equal.
Scalene triangle: All sides and angles are different.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A==B && B==C){
            System.out.println("Equilateral triangle");
        }else if(A==B || B==C){
            System.out.println("Isosceles triangle");
        }else{
            System.out.println("Scalene triangle");
        }
    }
}