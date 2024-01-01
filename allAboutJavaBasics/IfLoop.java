package allAboutJavaBasics;

public class IfLoop {
    public static void main(String[] args) {
        boolean  b = false;
        int a = 78;
        if(b){
            System.out.println("b is true");
        }else {
            System.out.println("b is not true");
        }

        if(a ==89){
            System.out.println("a is verified and correct");
        }else {
            System.out.println("a is not correct");

            boolean c = true;
            c = !c;
            if(2+2 >= 4){
                System.out.println("Inside the loop code will be execute when the condition is true");
            }
            else
            {
                System.out.println("Inside the loop code will be execute when the condition is false");
            }

            System.out.println("This is outside the loop, it will be executed always");
        }

        if(true){
            System.out.println("1");
            if(true){
                System.out.println("2");
                if(false){
                    System.out.println("3");
                }
            }
        }


    }
}
