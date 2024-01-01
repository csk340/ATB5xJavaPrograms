package Dec_23rd;

public class ForLoopBasicandExitCode {
    public static void main(String[] args) {

        // Condition
        // -> If, If Else, If Else-If, Else, Switch ( BREAK)
        // -> CHeck for some condition, true or false
        // No Break and Continue
        // Switch ( BREAK) ->



        // Loops
        // -> Do perform a task multiple times
        // -> For, While, Do while,
        // Break and Continue


        // For, While and Do While

        // For Loop ->
        // 1. Use to perform a task multiple times
        // 2. Based on condition -> task multiple times.


        // Repetitive Task
        System.out.println("Pramod"); // 10 times not recommended as waste of memory and time

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop.
        // C ->  Increment / Decrement

        // A -> int i = 1
        // B -> i < = 10 ;
        // C -> i++ -> Post increment
        // D -> Which code -> System.out.println("Pramod");

//        for(A;B;C){
//            D
//        }
        // <= -> < =
        for(int i=1; i<=10;i++){
            System.out.println("Pramod");
        }

        //
        // 0,1,2,3,4,5,6,7,8,9 -> 10 TIMES
        // 1,2,3,4,5,6,7,8,9,10 -> 10 TIMES
        for(int i=0; i<10;i++){
            System.out.println("Pramod");
        }

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop.
        // C ->  Increment / Decrement

        // ICID ->
        for(int i=1; i<=10;i++){
            System.out.println("Pramod");
        }
        System.exit(500);
        System.exit(789); //whatever number you give here will print in output as exit code
        //If there are multiple exit codes then in o/p first line exit code will display(i..e for above two o/p exit code = 500)
        // Exit Code - 0 - Normal/Successful run of program
        // Exit Code - 1 - Force Exit
        // Exit Code - 130-137 - You do it/User interrupted
    }
}
