package Jan_7th_OOPS.Encapsulation.Example1;

public class ICICI {

        public String getName() {
            System.out.println(name);
            return name;
        }

        public ICICI(String name, long bal) {
            this.name = name;
            this.bal = bal;
        }

        public void setName(String name) {
            this.name = name;
            System.out.println(this.name);
        }

        public long getBal() {
            System.out.println("Hi I am from get balance: "+this.bal);
            return bal;

        }

        public void setBal(long bal) {
            if(bal > 0) {
                this.bal = bal;
                System.out.println("Hi I am from set balance: "+this.bal);
            }
            else{
                System.out.println("Not allowed!!");
            }
        }

        String name;
        long bal;
}
