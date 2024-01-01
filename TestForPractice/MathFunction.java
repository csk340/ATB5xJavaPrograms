package TestForPractice;

public class MathFunction {
    public static void main(String[] args) {
        //WAPTP value of (x^2 + y^2  - |z|)
        int x = 3;
        int y = 4;
        int z = -6;
        //System.out.println(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));//9+16-6=19
        //if value of z is negative then:-
        System.out.println(Math.pow(x,2) + Math.pow(y,2) - z);//9+16-(-6)=31

    }
}
