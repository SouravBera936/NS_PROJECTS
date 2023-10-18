/*Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
1. Think of a number X(don't tell Sara)
2. Add A(Given by Sara) to it.
3. Double the sum in your mind.
4. Add an even number B(Given by Sara) to it.
5. Half the amount
6. Subtract the initial number which you had taken from the sum
After this Sara will tell the resulting amount without knowing the initial number, can you print the result for her?
Note: B is always even.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int X=700;
       int A=sc.nextInt();
       int B=sc.nextInt();
       X=(((2*(X+A))+B)/2)-X;
       System.out.println(X);
    }
}