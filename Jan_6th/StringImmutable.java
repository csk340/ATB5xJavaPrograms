package Jan_6th;

public class StringImmutable {
    public static void main(String[] args) {
        String str = "Chinmay";
        String str2 = str.concat(" Kulkarni");


        System.out.println(str);
        System.out.println(str2);
        System.out.println(str);//Here even value concatenated for str2 using str still original value of str
        // will not change which is nothing but string are immutable
        //Immutable:- Values can't be changed
    }

}
