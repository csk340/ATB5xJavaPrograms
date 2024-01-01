package allAboutJavaBasics;

public class RangeBasics {
    public static void main(String[] args) {
        byte a = 50;
        a-= 20; //this is addition/subtraction method for byte "a+=" without any space in between
        // cant subtract directly i.e a= a-20 for byte data type operations
        System.out.println(a);
        System.out.println(a+80);//this value is for only this line
        System.out.println(a);//Here value will be same as (50-20) = 30
        a = 60;//this value will be updated for above a (which is -50 which now become as 60)
        System.out.println(a);
    }
}
