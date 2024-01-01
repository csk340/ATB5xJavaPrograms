package Dec_23rd;
//Check for only continue without condition
public class PContinueKeyword {
    public static void main(String[] args) {
//Let's see use of continue keyword:-
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Val Even of ->" + i);
                //continue;
                //System.out.println("I am from below continue keyword it will skip for even number");
            }
            System.out.println("Val Odd of -> " + i);

        }
//            for (int i = 0; i < 10; i++) { // 10 Times, i -> 0 to 9
//                System.out.println(i);
//                if (i == 5) continue;
//                System.out.println("I am after the use and implementation of continue keyword");
//
//            }
    }
}
//Continue means after that condition gets satisfied/ture then continue program from start (do not execute code below it for only that i value (i.e. 5 here) from 6 print statement will execute
/*
       o/p is:
       .
       .
       .
       4
       I am after the use and implementation of continue keyword
       5
       6
       I am after the use and implementation of continue keyword
       .
       .
       .
       9
       I am after the use and implementation of continue keyword
 */