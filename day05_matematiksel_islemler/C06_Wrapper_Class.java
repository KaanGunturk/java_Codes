package day05_matematiksel_islemler;

public class C06_Wrapper_Class {

    public static void main(String[] args) {

        String str1= "12345";
        String str2= "23456";

        //verilen iki string deki sayilari toplayin

        System.out.println(str1+str2);

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2) );

    }
}
