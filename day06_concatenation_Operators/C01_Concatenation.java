package day06_concatenation_Operators;

public class C01_Concatenation {

    public static void main(String[] args) {

        String str1 = "JAva";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;

        System.out.println(str1+sayi1+str2); //Java5Guzel yazdir.

        System.out.println(sayi1-sayi2+str2+(sayi1*sayi2)); //2Guzel15 yazdir.

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); //java22 yazdir.

        System.out.println(sayi1+""+sayi2+str2); //53Guzel yazdır.
        System.out.println(""+sayi1+sayi2+str2);

        //Tamemen sayilardan olusan bir String varsa ve biz bunu int'a cevirmek istersek Integer.valueOf(str)
        //bir sayiyi String'e cevirmek istersem ""+sayi

    }
}
