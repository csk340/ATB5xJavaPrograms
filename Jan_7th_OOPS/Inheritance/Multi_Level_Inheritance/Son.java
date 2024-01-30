package Jan_7th_OOPS.Inheritance.Multi_Level_Inheritance;

public class Son extends Father {
    public void Calm()
    {
        System.out.println("Son: I love to keep Calm");
    }

    public static void main(String[] args) {
        //Now when son is born it has both persons properties (i.e. GF and F)
        Son obj = new Son();//All methods can be call
        //Father obj = new Father();//Only access fightBehavior and compare
        //GrandFather obj = new GrandFather();//only access fightBehavior
        //Father obj = new Son();//Only access fightBehavior and compare
        //GrandFather obj = new Father();//only access fightBehavior
        //GrandFather obj = new Son();//only access fightBehavior
        //Father obj = new GrandFather();//Not possible as we try to create GF using F
        //Son obj = new Father();//Not possible as we try to create F using S
        //Son obj = new GrandFather();//Not possible as we try to create GF using S
        obj.fightBehavior();
        obj.Compare();
        obj.Calm();
    }
}
