package Dec_23rd;

public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println(a);
        }while (a<1);//even this condition is false then also program will execute for first time

        int b = 0;
        do {
            System.out.println(b);
            b--;
        } while (b < -5);

        int i = 10; // Init
        do {
            System.out.println(i); // Body
            i++; // Increment
        } while (i < 10); // Condition
    }
}
