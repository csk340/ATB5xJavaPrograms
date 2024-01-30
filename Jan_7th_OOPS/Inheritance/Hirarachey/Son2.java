package Jan_7th_OOPS.Inheritance.Hirarachey;

public class Son2 extends Father {
    public void Son2Test()
    {
        System.out.println("Son2: Little naughty but taking care of all and I will use 3 BHK with paying loan of 20 lakhs");
    }

    public static void main(String[] args) {
        Son2 obj2 = new Son2();
        obj2.Son2Test();
        obj2.BHK3();
        obj2.loan();

    }
}
