package allAboutJavaBasics;

public class SlashCommand {
    public static void main(String[] args) {
        char a = '\n'; // new line
        char b = '\t'; // new tab or space
        char c = '\b'; // backlash delete last character
        char d = '\r'; // delete last word
        System.out.println(a);
        System.out.println("vaidehi"+b+"chinmay");
        System.out.println("vaidehi"+d+"chinmay");//delete vaidehi(word before \r)
        System.out.println("kulkarnid"+c);//delete last character
        System.out.println("chinmays");
        System.out.println("Pramo\"d"); //
        System.out.println("Pramod's");//to print ' or " characters between string

    }
}
