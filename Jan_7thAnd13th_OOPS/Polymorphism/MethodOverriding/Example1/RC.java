package Jan_7thAnd13th_OOPS.Polymorphism.MethodOverriding.Example1;

public class RC {
    public static void main(String[] args) {
        //Test obj = new Test(); //test obj and test ref so only test class method will execute
        //obj.test();

        //Middle obj1 =  new Middle(); //same as above middle will get execute
       // obj1.test();

        Test obj3 = new Middle(); //IMP:- So here runtime polymorphism happen and only
        // Middle class test method will get execute
        obj3.test();
        //Output:- Hi I am also from test method with no args from Middle class ******IMP******
        //Also called as Dynamic Dispatch
        //Ambiguity which method should call as both have same name and args also
    }
}
