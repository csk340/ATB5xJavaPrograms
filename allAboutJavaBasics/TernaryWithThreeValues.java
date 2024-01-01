package allAboutJavaBasics;

public class TernaryWithThreeValues {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;
        int c = 60;
        int max = (a>b ? (a>c ? a : c) : (b>c ? b: c)); //Very Interesting:-)
        System.out.println("Maximum value among three values is:" +max);
      //  find max and min between above three values

        int min = (a<b ? (a<c ? a : c): (b<c ? b:c)); //Very Interesting:-)
        System.out.println("Minimum value among three values is:" +min);


    }
}
