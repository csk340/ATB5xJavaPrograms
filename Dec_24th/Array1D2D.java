package Dec_24th;

public class Array1D2D {
    public static void main(String[] args) {
       /* int a[][] = {(45,56,78), (98,21,89), (19,67,35)}; //Not working
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                System.out.println(a[i][j]);
            }
        }*/


        //int a[] = {1,56,32,67}; or int c[] = new int[n]; //1D array which saw previously ["int [] c=" is also ok]
        int b[][] = new int[3][3]; //declaration of 2D array
        //Assigning values in declared array

        //45  56  78
        //98  21  89
        //19  67  35

//1st array/1st row initialization
        b[0][0] = 45;
        b[0][1] = 56;
        b[0][2] = 78;

//2nd array/2nd row initialization
        b[1][0] = 98;
        b[1][1] = 21;
        b[1][2] = 89;

//3rd array/3rd row initialization

        b[2][0] = 19;
        b[2][1] = 67;
        b[2][2] = 35;

        for (int i=0;i<b.length;i++)
        {
            for (int j=0;j<b.length;j++)
            {
                System.out.print(b[i][j]+"\t");

            }
            System.out.println();
        }

    }
}
