package Jan_6th.Constructor;

public class Conseg1RunnerClass {
    public static void main(String[] args) {
        ConstructorExample1 str = new ConstructorExample1(); // Default constructor
        str.name = "Amit";
        str.printDetails();

        ConstructorExample1 p3 = new ConstructorExample1("Pramod");
       p3.name = "Chinmay";
        p3.printDetails();

    }

}
