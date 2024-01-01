package allAboutJavaBasics;

public class TernaryOperator {
    public static void main(String[] args) {
        //(condition ? true : false)
        //If condition true then execute true part vice varsa for false condition
        int a=20;
        int b=40;
        int c = (a<b ? a : b);//syntax for ternary operator
        int d = false ? 10: 20;
        System.out.println(c);
        System.out.println(d);
        String str= 10 > 20 ? "10" : "TWENTY";
        System.out.println(str);

        int e = 50;
        int f =60;
        //find min and max using ternary operator:-
        int max = (e<f ? f:e);
        int min = (e<f ? e:f);
        System.out.println("maximum number between e and f is: "+max);
        System.out.println("minimum number between e and f is: "+min);
    }
}
