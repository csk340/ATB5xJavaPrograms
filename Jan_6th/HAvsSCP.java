package Jan_6th;

public class HAvsSCP {
    public static void main(String[] args) {
        String str = "Hi I am normal string"; //This string will stored in string constant pool(scp)
        String str2 = new String("Hello I am string from object ");//First memory will be allocated inside heap area and string will be stored in it
        System.out.println(str);
        System.out.println(str2);
        str = "Updated";

        System.out.println(str);//latest value will be updated
        String str3 = str.concat(" Hi I am just for concatenate");
        System.out.println(str3);//concatenated value will be stores in str3.......
        System.out.println(str);//.......but str value will be not change

        System.out.println(str3.contains("i"));
        System.out.println("---------------------------------");
        String str4 = "ABC";
        String str5 = "abc";
        System.out.println(str4.equals(str5));//false
        System.out.println(str4.equalsIgnoreCase(str5));//true
        String str6 = new String("abc");
        System.out.println(str5==str6);//false - as reference is diff
        System.out.println(str6.equals(str5));//true - as values are same

        System.out.println("---------------------------------");

        String s1 = "Pramod";
        String s2 = new String("Pramod");
        String s3 = new String("pramod");
        String s4 = new String("pramod");
        System.out.println(s1 == s2); // false
        System.out.println(s2==s3);//false - as referances are same but case difference
        System.out.println(s2.equalsIgnoreCase(s3));//true
        System.out.println(s1.equals(s2));//true
       /* IMP*/ System.out.println(s3==s4);//true -> no it's false as both have different references as different objects
        System.out.println(s3.equals(s4));//true
        System.out.println(s1.equalsIgnoreCase(s3));//true

    }
}
