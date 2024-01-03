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

            if((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
            || word.charAt(i) == 'u') ||
                    (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O'
                            || word.charAt(i) == 'U'))
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
