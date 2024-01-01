package allAboutJavaBasics;

public class IncrementOperator {
    public static void main(String[] args) {
        // Increment operator.
        // Pre and Post
        int a = 10;
//        a = a+1;
//        a +=1;
        a++; // Post Increment - a = a+1;
        ++a; // Pre Increment  = a = a+1;
        System.out.println(a); //12



        int b = 10;
        System.out.println(++b);//11
//        // Pre Increment ++ in front variable like a -> pre ->do increment first then print
          //Always incremental/decremental values will be carry forward for next all lines inside main method

        int c = 10;
        System.out.println(c++);//10
        System.out.println(c);//11
        // Post Increment
        // ++ after variable like a++ -> post ->
        // first print, do increment
        // Increment operator.
        int d = 10;
        System.out.println(++d + d++ + d++); //11 + 11 + 12 = 34
        System.out.println(d);//13

        int e = 10;
        System.out.println(++e + e++);//11+11 =22
        System.out.println(e);//12

        int f = 10;
        System.out.println(--f + f--);//9+9 = 18
        System.out.println(f);//8

        int g = 10;
        System.out.println(--g + g++ + ++g);//9+9+11 = 29
        System.out.println(g);//11


    }
}
