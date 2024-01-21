package PracticeMakesManPerfect;

public class PalindromeWithoutSBDorSBF {

    public static void main(String[] args) {
        String name = "mom"; // P r a m o d
        String y = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            y = y + name.charAt(i);
        }
        System.out.println(y);
        if (name == y)
        {
            System.out.println(name+"is a Palindrome number");
        }
        else
        {
            System.out.println(name+"is not a Palindrome number");
        }
    }
}
