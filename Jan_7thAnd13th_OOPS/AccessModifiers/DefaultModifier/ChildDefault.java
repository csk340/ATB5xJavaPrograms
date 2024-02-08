package Jan_7thAnd13th_OOPS.AccessModifiers.DefaultModifier;

import java.lang.reflect.Method;

public class ChildDefault extends Default {
    //child class extends parent where default variable/method is present
    public static void main(String[] args) {
        ChildDefault obj = new ChildDefault();
        System.out.println("I am from ChildPublic calling the default method from parent");
        obj.Method();//Can call default methods from same packagsub-class

    }
}
