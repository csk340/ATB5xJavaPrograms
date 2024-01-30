package Jan_7th_OOPS.Inheritance.Single_Inheritance;

public class Child extends Parent {
    public static void main(String[] args) {
        //1
        Child obj = new Child();//Possible to call all methods both parent common methods and child  specific methods
        //2//Parent obj = new Child();
        //3//Parent obj = new Parent();
        //4//Child obj = new Parent();
        obj.speak();
        obj.walk();
        obj.thoughProcess();//For 2, it's not possible, as we have given parent reference, so we can't access child specific methods
        //Parent reference can be used to hold child class objects, but we can't call child specific methods using parent reference
        //Similarly for 3, we created object for parent with parent reference, so we can access only parent methods
        //For 4, we can't give child reference to create parent as parent is present before child and not after

    }

    public void thoughProcess()
    {
        System.out.println("Hi I am Chinmay my thought process is different than my parents");
    }

}

