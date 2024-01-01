package allAboutJavaBasics;

public class LogicalOperator {
    public static void main(String[] args) {
        //AND GATE -> && -> Multiplication True * False = 1*0 = 0 -> False
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        //OR GATE -> || -> Addition True + False = 1+0 = 1 -> True
        System.out.println(true || true );//true
        System.out.println(true || false );//true
        System.out.println(false || true );//true
        System.out.println(false || false );//false

        int a =100;
        int b=100;
        boolean c = a<= b;
        System.out.println(c);//true as one of both condition is true OR -> addition
        //100<100 = False OR I.E. "+" 100=100 = True -> False + True= 0+1 = 1 i.e. True
        //So final output is true
    }
}
