package Jan_7thAnd13th_OOPS.Polymorphism.Test;

public class IV3 {
    public static void main(String[] args) {
        P03 h=null;//Nothing h=null
        P03 h2=new P03();
        //System.out.println(h.a); //NullPointerException
        System.out.println(h2.a);//0
    }
}

class P03 {
    int a;
}
