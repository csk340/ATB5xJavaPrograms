package Jan_7th_OOPS.Polymorphism.MethodOverloading;

public class RC {
    public static void main(String[] args) {
        Test obj = new Test();
        //obj.Method1();//Method without args is called
        //obj.Method2("Chinmay");//Method with only String arg is called
        //obj.Method3("Chinmay",4);//Method with String and int args is called
        obj.Method4("Chinmay",4, true );//Method with String, int and boolean args is called

        //This is called as Overloading (Same method name but different arguments
    }
}
