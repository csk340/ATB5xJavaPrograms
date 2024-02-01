package Jan_7th_OOPS.Encapsulation.Example2;

public class Student {
    private String name = "JOHN ";// Private variable not allowed to access/modify by outsiders directly
    //getter method for name
    public String getName(){//We can allow to other members to read the priavte data(i.e. name value)

        return name;

    }
    //setter method for name
    public void setName(String name){//We can allow to other members to modify private data (i.e. name)

        this.name=name;
      //  System.out.println(this.setName());

    }
}
