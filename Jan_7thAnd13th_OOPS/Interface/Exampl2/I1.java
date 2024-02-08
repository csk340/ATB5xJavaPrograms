package Jan_7thAnd13th_OOPS.Interface.Exampl2;

public class I1 {
    static int a=100;
    public static void main(String[] args) {
        // new A1();
        System.out.println(A1.a);
        System.out.println(I1.a);//Static variable can be called using class name
    }
}


interface A1{
    int a = 10; // final variable and static variable
}
