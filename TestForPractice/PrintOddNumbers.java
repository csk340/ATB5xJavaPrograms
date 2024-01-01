package TestForPractice;

public class PrintOddNumbers {
    public static void main(String[] args) {
      //  WAPTP odd numbers from 1 to 50
            for (int i=1;i<=50;i++)
            {
                if (i%2!=0)
                {
                    System.out.println(i+": is a odd number");
                }
            }

        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x"  + i  + " = " + (num*i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i%2 == 0){
                break;
            }
        }
    }
}
