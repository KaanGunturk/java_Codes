package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim = "oguzhan";
        String soyisim = "BALKAYA";
        String kkNo = "1234567890123456";


        String yeniısım = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");

        String yenisoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\s", "*");

        String yeniKkNo = "**** **** **** " + kkNo.substring(12);

        System.out.println("isim-soyisim : " +yeniısım+" "+yenisoyisim+ "\nkart no : " + yeniKkNo);

        String str = "java kolaydir";
        System.out.println(str.endsWith(""));


    }
}
