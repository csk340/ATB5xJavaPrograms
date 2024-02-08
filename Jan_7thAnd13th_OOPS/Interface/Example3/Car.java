package Jan_7thAnd13th_OOPS.Interface.Example3;

public class Car implements Break, Engine{//Multiple is possible in Interface
                                          //i.e. one child can have two parents in case of interface
    void start(){
        System.out.println("Starting the Car");
        startEngine();
        breaks();
    }

    @Override
    public void breaks() {
        System.out.println("Hi I am from breaks method of Break interface");
    }

    @Override
    public void startEngine() {
        System.out.println("Hi I am from StartEngine method of Engine interface");

    }
}
