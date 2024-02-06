package Jan_7th_OOPS.Abstraction.Example1;

public class Chinmay extends Father{
    @Override
    void AkashMethod() {
        System.out.println("Hello I am Akash from Chinmay");
    }

    @Override
    void AkshyaMethod() {
        System.out.println("Hello I am Akshya from Chinmay");
    }

    @Override
    void ChinmayMethod() {
        System.out.println("Hello I am Chinmay from Chinmay");
        Fmethod();
    }


}
