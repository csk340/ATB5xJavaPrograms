package PracticeMakesManPerfect;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Principle, Rate of Interest, Time
        System.out.println("Please enter Principle amount: ");
        int principle = sc.nextInt();
        System.out.println("Please enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.println("Please enter time durartion: ");
        double year = sc.nextDouble();
        double SI = (principle*rate*year)/100;
        System.out.println("Simple Interest = "+SI);

    }
}
