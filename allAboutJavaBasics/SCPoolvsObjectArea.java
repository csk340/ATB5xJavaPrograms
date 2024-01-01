package allAboutJavaBasics;

public class SCPoolvsObjectArea {
    public static void main(String[] args) {
        //In this program will check how storing of values will be done
        String s1 = "Pramod";
        // This will store value in String Constant Pool - SCP / String Pool

        String s2 = new String("Pramod");
        //new operator is used to create the new object for class and store value in object area/heap area
        // It returns of the address of newly created object.
        System.out.println(s1);
        System.out.println(new String("Pramod"));
    }
}
