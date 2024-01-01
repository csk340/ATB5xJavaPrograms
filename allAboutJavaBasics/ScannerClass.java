package allAboutJavaBasics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //WAPTP user entered number is odd or even?
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();
        if (number%2 == 0)
        {
            System.out.println(number+" is an Even number");
        }
        else
        {
            System.out.println(number+" is an odd number");
        }
    }
}
