package day14_stringManipulation;

public class C01_trim {

    public static void main(String[] args) {

        String str = "    Sİz ne derseniz diyin,  java istedigi gibi calisir.";

        str.trim();
        System.out.println(str); // farklılık olmadan yazdirir.
        System.out.println(str.length());

        str =str.trim();
        System.out.println(str);
        System.out.println(str.length());
    }
}
