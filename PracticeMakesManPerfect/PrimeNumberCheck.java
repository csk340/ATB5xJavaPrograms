package PracticeMakesManPerfect;
//Copy Pasted

import java.util.Scanner;

/* Problem Statement:-
2. Prime Number Checker: Create a program that checks if a given number is prime or not.
Use loops to divide the number by all numbers lesser than it to check for divisibility.
 */
public class PrimeNumberCheck {
    public static void main(String[] args) {
        //Main logic here is to limit till where to check the given number is divisible by
        //Answer:-  check till half of the number
        // Prime Number Condition num%i(i -> 2 to num) == 0 -> x
        //  0 -> X
        // 1 -> X
        // 2 -> prime?
        // 3 -> ?
        // 4 -> ?

        int i = 0;
        int flag = 0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();

//        17 -> 2 to 17/2 -> num%i == 0 -> not a prime
//
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("Not a prime -> " + n);
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n+"is Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }

        if(flag ==0 ){
            System.out.println(n+" is a Prime Number");
        }



    }
}
