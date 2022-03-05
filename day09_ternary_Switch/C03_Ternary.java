package day09_ternary_Switch;

public class C03_Ternary {

    public static void main(String[] args) {

        int sayi = 140;

        //verilen sayinin 3 veya daha cok basamaklı olup olmadigini kontorl eden ve sonucu yazdiran


        String sonuc = sayi >= 100 ? "Sayi 3 Basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";

        System.out.println("girdiginiz sayi analizi : " + sonuc);

        //TErnary bise sonuc dondurdugu icin ya bu sonucu direk yazdırmalıyız yada sonucun dadta turune  uygun bir
        // variable'a atama yapabiliriz
    }


}
