package TestForPractice;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b i will swap those value: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Here the concept of temporary variable comes in picture
        /*Logic:-
        1. Create temporary variable and assign value of a to it
        2. Now assign value of b to a
        3. Then assign that temp value to b
        */

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Hoorey..!! Here the value of a and be after swap:-");
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);

//       two more ways:- without using third variable
//        a = a+b;  or  a=a*b
//        b = a-b;  or  b=a/b
//        a = a-b;  or  a=a/b


/* Your Try:- Looks not in optimized way
        int expr1 = a-a+b;
        int expr2 = b-b+a;
        System.out.println("Hoorey..!! Here the value of a and be after swap:-");
        System.out.println("a = "+expr1);
        System.out.println("b = "+expr2);
*/

    }
}
