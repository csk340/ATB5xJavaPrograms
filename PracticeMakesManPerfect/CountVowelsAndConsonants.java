package PracticeMakesManPerfect;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string to count vowels and consonants:- ");
        String word = sc.next();
        for (int i=0; i<=word.length()-1;i++)
        {
            char ch = word.charAt(i);
            if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u') ||
                    (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
                            || ch == 'U'))
            {
                vowels=vowels+1;
            }
            else
            {
                consonants = consonants+1;
            }
        }
        System.out.println("Count of Vowels= "+vowels);
        System.out.println("Count of Consonants= "+consonants);
    }
}
