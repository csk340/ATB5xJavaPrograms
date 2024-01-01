package Dec_30th;

public class FunctionWithReturnType {
    public static void main(String[] args) {
        //This is calling of function section (main method)
        int Function = Chinmay_Function(4,5);
        System.out.println(Function);
    }
        //This is defination of function section (class method)

    static int Chinmay_Function(int a, int b)
    {
        return a+b;
    }
    //Syntax for function calling is:-
    //datatype variable_name = Function_name (arguments);


    //Syntax for defination of function is:-
    //
    //    accesss_modifier  datatype function_name (parameters/arguments_with_datatypes)
    //{
    //     function_body;
    //}
    /*
    How it works??:-
    1. First main method will execute so line 6 will execute which is calling function so it will search for defination of that called function in class
    2. Defination starts from line 10 so control will go to line 10 and assigning of values takes place
    3. Continuing 10th line bracket it will execute whatever inside it and returned value will be now stored in Function at line number 6
    4. So now Chinmay_Function(4,5) will be replaced by 4+5=9
    5. At last line 7 will execute
     */


}
