package Jan_6th.Constructor;

public class ExampleConstr {
    String name;
    int age;

    public static void main(String[] args) {
        //ExampleConstr obj = new ExampleConstr();
        ExampleConstr obj1 = new ExampleConstr("Pramod" , 34);
        //obj.name = "Chinmay";
        //obj.age =56;
        //obj.printDetails();
       // obj1.printDetails();

    }

    ExampleConstr()
    {
        name = "Vyankatesh";
        System.out.println(name);//Vyankatesh

    }
    ExampleConstr(String name , int age)
    {
        this.name = name;//means we are assigning parameterized constructor value to this variable which is only applicable for this constructor
        System.out.println(this.name);//Pramod
       this.age = age;//means we are assigning parameterized constructor value to this variable which is only applicable for this constructor
        System.out.println(this.age);//34 //If here you use this.age then output will be 0
    }
    public void printDetails()
    {
        System.out.println("My name is: "+name);
        System.out.println("My age is: "+age);
    }

}
//Vyankatesh
//Pramod
//34
//My name is: Chinmay
//My age is: 56
//My name is: Pramod
//My age is: 34