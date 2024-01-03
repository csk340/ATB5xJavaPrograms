package PracticeMakesManPerfect;

import java.util.Scanner;

/*
Problem Statement:-
Create a program that converts temperatures from Fahrenheit to Celsius and vice versa,
using conditional statements to handle the direction of conversion.
 */
public class TemperatureCoverter {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter temperature in Fahrenheit:  ");
        double temp = sc.nextDouble();
        //F TO C = (100°F − 32) × 5/9 = 37.778°C
        double conversion = (temp-32)*5/9;
        System.out.println("Celsius conversion of given Fahrenheit temperature is: "+conversion);

        Scanner sc2 = new Scanner (System.in);
        System.out.println("Please enter temperature in Celsius:  ");
        double temp1 = sc2.nextDouble();
        //C TO F = (100°C × 9/5) + 32 = 212°F
        double conversion2 = (temp1 * 9/5) + 32;
        System.out.println("Fahrenheit conversion of given Celsius temperature is: "+conversion2);

    }
}
