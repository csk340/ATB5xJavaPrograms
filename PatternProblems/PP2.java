package PatternProblems;

public class PP2 {
    public static void main(String[] args) {
        /*
        Problem Statement:- Left Triangle Star Pattern
        * * * * *
        * * * *
        * * *
        * *
        *
        As i is increasing j is decreasing
        */
            for (int i=1;i<=5;i++)
            {
                for (int j=5;j>=i;j--)
                {
                    System.out.print("*"+"\t");
                }
                System.out.println();
            }
    }

}
