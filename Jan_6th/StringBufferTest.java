package Jan_6th;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class StringBufferTest {

  //  StringBuffer & StringBuilder provides mutable sequence of characters

    public static void main(String[] args) {


        StringBuffer s = new StringBuffer("Chinmay");
        System.out.println(s);//chinmay
        //but if we revese this s then it will reveser  SBF obj and not actual string hence need to convert it to string using ".toString()"
        s.append(" Kulkarni");
        System.out.println(s);//Chinmay Kulkarni
        System.out.println(s.equals("Chinmay Kulkarni"));
        System.out.println(s.hashCode());
        System.out.println(s.insert(7," d "));//Chinmay d  Kulkarni
//        System.out.println(s);//As SBUID and SBUFF are Mutable hence value of s now updated from "Chinmay Kulkarni"
//        to "Chinmay d  Kulkarni"
        System.out.println(s.delete(0,1));//hinmay d  Kulkarni
        System.out.println(s.reverse());

    }
}
