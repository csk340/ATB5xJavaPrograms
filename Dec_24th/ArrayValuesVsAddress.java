package Dec_24th;

public class ArrayValuesVsAddress {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println("Lengthh ->" + arr1.length);//5

        System.out.println("Ref Address -> " + arr1);//address

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println(arr1[i]*2);//double the array
        }
    }
}
