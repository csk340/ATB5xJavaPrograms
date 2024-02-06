package Jan_7th_OOPS.Polymorphism.Test;

public class IV4 {
    public static void main(String[] args) {
        //System.out.println(P04.a);
        System.out.println(P04.b);
        P04.run2();
        P04.run();
        System.out.println("----- END OF PROGRAM -----");
    }
}


class P04 {
    int a;
    static int b;

    static void run2(){
        System.out.println("Hahah from run2");
    }

    static void run(){
        System.out.println("from run test");

    }
}
