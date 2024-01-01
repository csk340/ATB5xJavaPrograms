package Dec_30th;

import java.util.Scanner;

public class FunctionReturnTypeWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        int b = scanner.nextInt();
        System.out.println("Enter value of c: ");
        int c = scanner.nextInt();
        int sum = function(a, b, c);
        System.out.println(sum);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
        static int function ( int a, int b, int c){
            return a+b+c;
        }


    }

