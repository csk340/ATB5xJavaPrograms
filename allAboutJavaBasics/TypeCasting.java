package allAboutJavaBasics;

public class TypeCasting {
    public static void main(String[] args) {
        /*Casting :- Casting means take only that capacity from big container which is fill that small container without overflow
       1.Implicit Casting -> a. Widening, b. Narrowing
       2.Explicit casting -> a. Widening, b. Narrowing
       Widening:- From small type to large type
       Narrowing:- From large to small
       Implicit:- Done by compiler automatically
       Explicit:- Programmer force JVM to do it


         */
        byte a = 50;
        // int b = a;
        // So here we are casting from short to big container which is possible easily so it is implicit(widening) casting done by compiler automatically
        int b= (byte) a; // So
        //Here we are force JVM for casting i.e. explicit(widening) casting (it's not recommended)
        System.out.println(b);

        int c = 500;
        //byte d = c; //Show error as implicit(narrowing) casting is not possible automatically - INVALID
        int e = 300;
        byte f = (byte) e;//Explicit (Narrowing) Casting
        System.out.println(f); //o/p:- 44 How? Check below binary flow:-
        // 32 Bits
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
        // will be sotred into the b
        // 0 0 1 0 1 1 0 0
//        0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
//        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0
        //44




    }
}
