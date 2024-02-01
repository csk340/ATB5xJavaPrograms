package Jan_7th_OOPS.Encapsulation.Example3;

public class Credentials {

    private String name = "Chinmay";
    private String email = "abc@gmail.com";
    private int password = 123456;

//    public void test()
//    {
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(password);
//    }
    public String getName()
    {
        System.out.println(name);
        return name;
    }
   public String getEmail()
    {
        System.out.println(email);
       return email;
    }

    public int getPassword()
    {
        System.out.println(password);
        return password;
    }


    public void setName(String name)//Syntax is important -> Take bit care of Inside bracket (String name) vvip
    {
        this.name = name;
        System.out.println(this.name);
    }

    public void setEmail(String email)
    {
        this.email = email;
        System.out.println(this.email);
    }

    public void setpassword(int password)
    {
        this.password = password;
        System.out.println(this.password);
    }

}
