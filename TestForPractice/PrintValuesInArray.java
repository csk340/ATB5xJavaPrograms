package TestForPractice;

import java.util.Scanner;

public class PrintValuesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int [] a = new int [size];
        System.out.println("Start entering value for the array with size = "+size);
        for (int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();

        }
        System.out.println("Hooray here is your array: ");
        for (int i=0;i<size;i++)
        {
            System.out.println(a[i]);

        }

        sc.close();

    }
}
