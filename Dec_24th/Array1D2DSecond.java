package Dec_24th;

public class Array1D2DSecond {
    public static void main(String[] args) {
         /*
            45  56
            98  21
            19  67
            23  37
         */
        int [][] not_same  = new int [4][2];//not_same.length = 4 what is the value of i(row) that will be length of that 2D array
        not_same[0][0] = 45;
        not_same[0][1] = 56;

        not_same[1][0] = 98;
        not_same[1][1] = 21;

        not_same[2][0] = 19;
        not_same[2][1] = 67;

        not_same[3][0] = 23;
        not_same[3][1] = 37;

      //  System.out.println(not_same.length);

        for (int i=0;i<not_same.length;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(not_same[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
