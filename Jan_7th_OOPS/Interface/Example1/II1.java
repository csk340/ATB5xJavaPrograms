package Jan_7th_OOPS.Interface.Example1;

public class II1 {
        public static void main(String[] args) {
            Hello h = new Hello();
            h.say();
            h.hello();
        }
    }


    interface II{//Collection of abstract methods which implemented by class "Hello" (who have implemented interface)
         void say();
        default void hello(){
            System.out.println("I am from Hello");
        }
    }


