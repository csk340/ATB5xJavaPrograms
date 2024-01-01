package allAboutJavaBasics;

public class Concatination2BODMAS {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String s1 = "Chinmay";
        String s2 = "Kulkarni";
        System.out.println(a+b+s1+s2); //30ChinmayKulkarni
        System.out.println(s1+s2+a+b); //ChinmayKulkarni1020
        System.out.println(s1+s2+(a+b)); //ChinmayKulkarni30 -> BODMAS First bracket will execute then rest things
        System.out.println(a+b+(s1+s2));//30ChinmayKulkarni

    }
}
