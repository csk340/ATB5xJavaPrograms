package allAboutJavaBasics;

public class EqualVsEquals {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        String name2 = new String("The Testing academy"); // Heap area
        //== check for refrences
        //.equals() Check for values
        System.out.println(name == name1);//true
        System.out.println(name.equals(name1));//true


        System.out.println(name == name2);//false

        System.out.println(name.equals(name2));//true wrong -> it's false as it's case sensitive
        System.out.println(name.equalsIgnoreCase(name2));//true

    }
}
