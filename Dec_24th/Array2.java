package Dec_24th;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1==arr2);//false
        System.out.println(arr1.equals(arr2));//false
        //We can't compare arrays as there references are different
        /*
        In above both cases output will be false as we can't compare arrays as there references are not same4
         */
        //If there are string then as per old one (i.e. == references and equals() values)
        String S1 = "Chinmay";
        String S2 = "Chinmay";
        String S3 = new String ("Chinmay");
        System.out.println(S1==S2);//true as references are same
        System.out.println(S1.equals(S2));//True as values are same
        System.out.println(S2==S3);//false as references are different
        System.out.println(S2.equals(S3));//true as values are same
        System.out.println(S3==S1);//false as references are different
        System.out.println(S3.equals(S1));//true as values are same

    }
}
