package Jan_6th.Constructor;

public class ConstructorExample1 {
    String name; // instance  variable values are default
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    // Default Constructor
    ConstructorExample1(){
        courseName = "ATB";
        System.out.println("I am Default!");
    }

    // Param Constructor
    ConstructorExample1(String valuefromObjectRef){
        this.name = valuefromObjectRef;
        System.out.println(this.name);//Pramod
    }

    void talk()
    {
        System.out.println(" Talk!!");
    }

    void printDetails(){
        System.out.println(this.name);//AmitD  , ChinmayP
        System.out.println(courseName);//ATBD , NullP

        //        String s; // Local Variable default value is never assigned by JVM
//        System.out.println(s);



        // Constructor is used to construct the object of a class.
        // name must be exactly the same as class
        // constructor is a special method.
        // it does not have a return type

        // - Default Constructor 18-19%
        //- Param Constructor - 70%
        // Copy Constructor in Java - <%1
    }

}

