package Jan_6th.Constructor;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DemoConstructor {
    DemoConstructor()//constructor syntax doesn't contain return type
    {
        System.out.println("Hello I am default constructor");
    }

    DemoConstructor(int a)
    {
        System.out.println("Hi i am parameterized construcot with a = "+a);
    }

    DemoConstructor(String name , int roll_number, double marks, char grade)
    {
        System.out.println("Hi i am parameterized construcot with below details:-");
        System.out.println("My name is = "+name);
        System.out.println("My roll number is = "+roll_number);
        System.out.println("My marks is = "+marks);
        System.out.println("My grade is = "+grade);

    }
}
