package TestForPractice;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        /* ✅ Grade Calculator:
         Write a program that calculates and displays the letter grade for a given
         numerical score (e.g., A, B, C, D, or F) based on the following
         grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59
         */

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter you percentile marks to know your grade: ");
        int marks = sc.nextInt();
        if (marks>= 90 && marks <= 100)
        {
            System.out.println("Your grade is A");
        }
        else if (marks>= 80 && marks <= 89)
        {
            System.out.println("Your grade is B");
        }
        else if (marks>= 70 && marks <= 79)
        {
            System.out.println("Your grade is C");
        }
        else if (marks>= 60 && marks <= 69)
        {
            System.out.println("Your grade is D");
        }
        else if (marks>= 50 && marks <= 59)
        {
            System.out.println("Your grade is E");
        }
        else
        {
            System.out.println("Bad News..!! Your failed in an examination. Please work hard..!!");
        }

    }
}
