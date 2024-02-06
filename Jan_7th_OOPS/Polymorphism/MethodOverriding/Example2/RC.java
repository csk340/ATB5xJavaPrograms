package Jan_7th_OOPS.Polymorphism.MethodOverriding.Example2;

public class RC {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();//Dog class method will execute

        Hound obj2 = new Hound();
        obj2.bark();//Hound class method will execute

        //Hound obj3 = new Dog(); // Not possible

        Dog obj4 = new Hound();
        obj4.bark();// Normally it will be only execute parent class methods
        //But in polymorphism or dynamic dispatch the case is reverse so Hound class's bark() method will get execute
        //Hence o/p will be:- I am Hound, I will Sniff!!
    }
}
