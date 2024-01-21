package Jan_6th;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Vaidehi ");
        s.append("Kulkarni");
        System.out.println(s);//Vaidehi Kulkarni
        System.out.println(s.equals("Vaidehi Kulkarni"));
        System.out.println(s.hashCode());//hashCode is bucket to collect element in o/p it will print address of that element
    }

}
