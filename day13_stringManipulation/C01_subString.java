package day13_stringManipulation;

public class C01_subString {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5)); // i'den baslayacak

        System.out.println(str.replaceAll("java", "Mehmet"));
        System.out.println("Mehmet hoca " + str.substring(5));


        System.out.println(str.substring(0, 5)); // Java
        System.out.println(str.substring(0, 1));
        String harf = str.substring(5,6); // 6. Harfi String olarak yazin
        System.out.println(harf);

        str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7)); //hiclik dondurur

        // System.out.println(str.substring(5,2)); hata verir

        System.out.println(str.substring(str.length()-1)); //Son harfi verir

        System.out.println(str.substring(str.length()-5)); // SOn 5 harfi yazdiralim

        System.out.println(str.substring(str.length())); // son harften sonraki kismi yani hiclik verir.
    }
}