package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim = "oguzhan";
        String soyisim = "BALKAYA";
        String kkNo = "1234567890123456";

        isimSoyisimGizle(isim,soyisim);
        kredikartiGizle(kkNo);



    }

    private static void kredikartiGizle(String kkNo) {
        String yeniKkNo = "**** **** **** " + kkNo.substring(12);
    }

    private static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniısım = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");

        String yenisoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\s", "*");

        return yeniısım + " " + yenisoyisim;
    }
}
