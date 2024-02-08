package Jan_7thAnd13th_OOPS.AccessModifiers.DefaultModifier;

import java.lang.reflect.Method;

public class NoRelation {
    public static void main(String[] args) {
        Default obj = new Default();
        obj.Method();//Can call default method from same package and non-subclass
    }
}
