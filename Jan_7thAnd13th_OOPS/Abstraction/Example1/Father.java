package Jan_7thAnd13th_OOPS.Abstraction.Example1;

public abstract class Father {
    public static void Fmethod()
    {
        System.out.println("I am from Father method");
    }

    abstract void AkashMethod();

    abstract void AkshyaMethod();

    abstract void ChinmayMethod();

    //Abstract method = Incomplete method or method without body
    //To implement:-
    //Make class as abstract class and method as abstract methodd
}
