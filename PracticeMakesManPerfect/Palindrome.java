package PracticeMakesManPerfect;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string I will check if it's palindrome or not: ");
        String string = s.next();
        StringBuilder sb = new StringBuilder(string);
        String reverseString = sb.reverse().toString();// Imp:- to convert that reversed builded/buffered string to convert in string
        //else will throw error as required type String but provided Stringbuilder/buffer


        if (string.equals(reverseString))
        {
            System.out.println("YES:-) given string "+string+" is a palindrome");
        }
        else
        {

            System.out.println("Sorry:-( given string "+string+" is not a palindrome");
        }
    }



    }

