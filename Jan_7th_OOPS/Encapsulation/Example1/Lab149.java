package Jan_7th_OOPS.Encapsulation.Example1;

public class Lab149 {
    public static void main(String[] args) {

        ICICI i = new ICICI("pramod", 100);
        i.getName();
        i.getBal();
        i.setBal(5000);
        i.setName("Lucky"); //Fine


    }
}
