package day11_stringManipulation;

import java.util.Locale;

public class C01_toLoweCase_toUpperCase {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        // str.charAt(5) Boyle yazdigimiz zaman sonuc artik string degil char olacaktir dolayisiyla String'de
        // yapmak istediğimiz tum degisikleri once yapip sonra charAt() method'unu kullanmaliyiz.

        System.out.println(str.toLowerCase().charAt(5)); //2. kelimenin ilk harfini kucuk olarak g yazar

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));


    }
}
