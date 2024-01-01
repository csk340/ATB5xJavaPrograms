package allAboutJavaBasics;

public class RelationalOperator {
    public static void main(String[] args) {

            int age1= 21;
            int age2=34;
            boolean c= age1>=age2;
            System.out.println(c); //false
            // >, < >=,<=, == , != ( ! = ) - Relational operators
            System.out.println( 10 == 10); //true
            System.out.println( 10 >= 10); //i.e. 10 is greater than or equal to 10 which is
            // true as any one is true out of 2 as or means any one true then true i,e, addition
            System.out.println( 10 <= 10);//true
            System.out.println( 10 > 10);//false
            System.out.println( 10 < 10);//false
            System.out.println('A' == 65);//true
            byte b=65;
            System.out.println('A'==b);//true
            System.out.println('A' == 65.0); // ? ( This is property of java)// true
            System.out.println('A' == 65.0f); //true
            int a='A';
            System.out.println('A' == 65.2);//false
            System.out.println('A' == 65.00000);//true
            // System.out.println(true >= true);//We cant use relational operator for boolean operator

        }
}
