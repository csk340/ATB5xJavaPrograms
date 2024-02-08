package Jan_7thAnd13th_OOPS.Abstraction.Example1;

public class Akshya extends  Father{
    @Override
    void AkashMethod() {
        System.out.println("Hello I am Akash from Akshya");
    }

    @Override
    void AkshyaMethod() {
        System.out.println("Hello I am Akshya from Akshya");
        Fmethod();
    }

    @Override
    void ChinmayMethod() {
        System.out.println("Hello I am Chinmay from Akshya");
    }

}
