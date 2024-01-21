package Jan_6th;

public class FunctionsOfString {
    public static void main(String[] args) {
        String str = "Chinmay";
        System.out.println(str.charAt(6));//y
        System.out.println(str.length());//7
        System.out.println(str.chars());
        System.out.println(str.indexOf("C"));//0
        System.out.println(str.indexOf("c"));//-1 as this string is not found in str
        //Index of will give -1 and not error if there is no such string(here small c) present in declared string(i.e.Chinmay)
        System.out.println(str.replace("i","b"));//Chbnmay
        String str2 = "Chinmay Kulkarni";
        /*Doubt*/ System.out.println(str2.split(" ").toString());// ["Chinmay" "Kulkarni"]
        System.out.println(str.substring(2));//inmay
        System.out.println(str.substring(1,4));//hin
        //str.substring(int BeginIndex, int EndIndex)//Imp:- EndIndex :- will take (endindex - 1) char/string
        //Here in line if we give as 1,3 then o/p will be:- "hi" (no including of "n")
    }
}
