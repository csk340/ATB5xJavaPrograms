package allAboutJavaBasics;

import java.util.Scanner;

public class SwitchCondition {
    public static void main(String[] args) {
        //WAPTP which day is today based on number from 1 to 7
        //Also can write program to print given letter is vowel or constraint
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number between 1 to 7 I will tell you which day it is: ");
        int number = sc.nextInt();
        switch (number)
        {
            case 1:
            {
                System.out.println("Day is Monday");
                break;
            }
            case 2:
            {
                System.out.println("Day is Tuesday");
                break;
            }
            case 3:
            {
                System.out.println("Day is Wednesday");
                break;
            }
            case 4:
            {
                System.out.println("Day is Thursday");
                break;
            }
            case 5:
            {
                System.out.println("Day is Friday");
                break;
            }
            case 6:
            {
                System.out.println("Day is Saturday");
                break;
            }
            case 7:
            {
                System.out.println("Day is Sunday");
                break;
            }
            default:
            {
                System.out.println("You have entered invalid number so can't recognize the day so executing default one.. Thanks..!!");
            }
        }
        System.out.println("-----------End of Program-----------");

         /*Switch -> Condition -> x -> multiple -> break!
         break -> pull you out of the current loop
         Condition -> One time
         break; -> Not possible with the if and else Condition ->
         other Loops -> for, while, do while - break and continue.
          */

    }
    }

