package Jan_7thAnd13th_OOPS.Interface.Exampl2;

interface Father1 {
    void load1K();

    default void print(){
        System.out.println("I am default method");
    }

    static void print2(){
        System.out.println("I am static METHOd!");
    }
}
