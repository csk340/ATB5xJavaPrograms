package Jan_7th_OOPS.Inheritance.Hirarachey;

public class Son1 extends Father {
    public void Son1Test()
    {
        System.out.println("Son1: Big Brother able to understand all brothers and I will use 3 BHK with paying loan of 20 lakhs");
    }

    public static void main(String[] args) {
        Son1 obj1 = new Son1();
        obj1.Son1Test();
        obj1.BHK3();
        obj1.loan();

    }
}
