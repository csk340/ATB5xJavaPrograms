package Dec_24th;

public class Array {
    public static <c> void main(String[] args) {
        //There are two ways to declare array

        int [] a = {23, 56, 67, 65};  //by directly declaring values in array
        // int a[] = {23, 56, 67, 65};
        int [] b = new int[5];  //by declaring size of array at declaration
        /*
     index value starts from zero so length of array a is 4 and index value of 65 is 3
         */
        //to print each value from array 1
        System.out.println(a[0]);//23
        System.out.println(a[1]);//56
        System.out.println(a[2]);//67
        System.out.println(a[3]);//65
        System.out.println(a.length);
        //to add values in declared array 2
        b[1] = 4;
        b[1] = 34; //will take updated value for the index
        b[3] = 8;
        b[0] =423;
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);//this value is not assigned so in o/p 0 will print as by default value of that index
        System.out.println(b[3]);

//        final int[] c = new int[4];
//        // b -> [0,0,0,0]
//        final c[0] = 78;
//        System.out.println(c[0]);
    }
}