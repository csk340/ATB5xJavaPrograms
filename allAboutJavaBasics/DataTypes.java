package allAboutJavaBasics;

public class DataTypes {
    public static void main(String[] args) {
        int a = 45;
        byte b =20;
        short c =3;
        long d =45l;
        double e = 34.5345343;
        float f = 67.89f;
        String g = "Welcome to Data types magic";
        char h = 'a';
        int i = 'A';
        char j = '\n'; //to move cursor to new line
        int k = '\u1F60';
        int age = 56;

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(h+i);
        System.out.println("Your age is:"+'\t'+age);//single quote importane to execute \t command
        System.out.printf("Your age is %d", age);
        System.out.println();
        //uses of %d/%s/%c/%f as per datatype
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float,double
        System.out.println("Print character present in this variable on next line "+'\t'+":"+'\n'+h);
        //using print f
        System.out.printf("Print character present in this variable on next line %c ",h);

    }
}
