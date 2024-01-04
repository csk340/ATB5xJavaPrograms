package PatternProblems;

public class PatternProblems {
    public static void main(String[] args) {
        /*
        Problem Statement:-  Right Triangle Star Pattern
        *
        * *
        * * *
        * * * *
        * * * * *
        As i is increasing J is also increasing
        */

        for (int i=1;i<6;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

    }
}
