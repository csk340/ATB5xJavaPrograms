package TestForPractice;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
       /* ✅ Triangle Classifier:

           Write a program that classifies a triangle based on its side lengths.
           Given three input values representing the lengths of the sides, determine

           if the triangle is equilateral (all sides are equal),
           isosceles (exactly two sides are equal), or
           scalene (no sides are equal).
           Use an if-else statement to classify the triangle.

         if  side1 == side 2 == side 3 ->  equilatera
         (side1 == side 2) or side 2 == side 3 -> isosceles
         if side 1 != side 2 != side 3 -> scalene
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter side 1: ");
        int side1 = sc.nextInt();
        System.out.println("Please enter side 2: ");
        int side2 = sc.nextInt();
        System.out.println("Please enter side 3: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("Your triangle is an equilateral triangle");
        }

        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("Your triangle is an isosceles triangle");
        }

        else
        {
            System.out.println("Your triangle is a scalene triangle");
        }
    }
}
