package TestForPractice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.


        // Coding ->
        // 1. user input - ?
        // 2. Rough logic ->( (year%4 == 0) -> leap and  (year%100 !=0) -> leap )  or   year % 400 == 0))
        // 3. Brute force
        // 4. Logic correction

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year I will tell you whether it's leap year or not");
        int Year = sc.nextInt();
        if ((Year%4==0 && Year%100 != 0) || (Year%400 ==0)) {// imp logic
            System.out.println(Year + " :is a leap year");
        }else {
                System.out.println(Year+" :is not a leap year");
            }
        }

    }

