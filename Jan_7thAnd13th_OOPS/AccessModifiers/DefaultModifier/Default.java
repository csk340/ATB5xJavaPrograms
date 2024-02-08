package Jan_7thAnd13th_OOPS.AccessModifiers.DefaultModifier;

import java.lang.reflect.Method;

 class Default {
//Class with default variable
    int a=10;

void Method()
{
    System.out.println("Hi I am from Default class default method");
}

    public static void main(String[] args) {
        Default obj = new Default();
       obj.Method();//Can call default method within class

    }

}
