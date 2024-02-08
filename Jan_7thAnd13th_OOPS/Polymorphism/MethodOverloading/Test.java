package Jan_7thAnd13th_OOPS.Polymorphism.MethodOverloading;

public class Test {
    public void Method1()
    {
        System.out.println("Hi I am method with no argument");
    }

    public void Method2(String name)
    {
        System.out.println("Hi I am method with String argument");
    }

    public void Method3(String name, int a)
    {
        System.out.println("Hi I am method with String and int arguments");
    }

    public void Method4(String name, int a, boolean r)
    {
        System.out.println("Hi I am method again with String, int and Boolean arguments");
    }
}

