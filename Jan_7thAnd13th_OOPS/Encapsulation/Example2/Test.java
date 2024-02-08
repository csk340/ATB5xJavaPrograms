package Jan_7thAnd13th_OOPS.Encapsulation.Example2;

public class Test {
    public static void main(String[] args){
//creating instance of the encapsulated class
        Student s=new Student();
//setting value in the name member
       s.setName("vijay");//We modified private variable value to vijay from JOHN
//getting value of the name member
        System.out.println(s.getName());
    }
}
