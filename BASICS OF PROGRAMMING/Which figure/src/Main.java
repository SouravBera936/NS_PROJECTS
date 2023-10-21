/*Given an integer n that represents the number of sides of a regular geometric figure,
 determine and print the name of the corresponding figure: triangle, square, pentagon,
 hexagon, heptagon, or octagon.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        switch(N){
            case 3: System.out.println("triangle");
                break;
            case 4: System.out.println("square");
                break;
            case 5: System.out.println("pentagon");
                break;
            case 6: System.out.println("hexagon");
                break;
            case 7: System.out.println("heptagon");
                break;
            case 8:  System.out.println("octagon");
                break;
        }
    }
}