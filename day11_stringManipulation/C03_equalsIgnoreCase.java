package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {

    public static void main(String[] args) {

        //Kullaniciya derse katilip katilmak istemediğini sorun
        //evet ders, cevabini "derse katiliminiz alinmistir" yazdirin
        //haiyr derse cevabini ve "Sonraki dersimize bekleriz" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \nEvet veya Hayir yaziniz.");
        String cevap =scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katiliniz onaylanmistir.");

        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " Sonraki dersimize bekleriz.");

        } else {
            System.out.println("Lutfen evet veya hayir giriniz.");
        }


    }
}
