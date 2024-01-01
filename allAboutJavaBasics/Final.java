package allAboutJavaBasics;

public class Final {
    public static void main(String[] args) {
        final int a = 123;
        System.out.println(a);
       // a= a+12; -> error
        System.out.println(a);
        final float f= 23.22f;
       // f= f+11.11f; -> error
        System.out.println(f);
        // We cant Re assign or update value of a final variable.

    }
}
