package TestForPractice;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        //WAPTP factorial of given number
        //i.e. 5!  = 5*4*3*2*1 = 120

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number I will tell factorial value of it: ");
        int number = sc.nextInt();
        int fact = 1;
        for (int i=1;i<=number;i++)
        {
            fact = fact*i;
        }
       System.out.println("Factorial of "+number+"! is: "+fact);

        //we can find sum of 1 to entered number also using above logic with minor changes like :-
        // 1. fact = fact + i;
        //2. int fact = 0; (as 1 matter in case of sum)
    }
}
