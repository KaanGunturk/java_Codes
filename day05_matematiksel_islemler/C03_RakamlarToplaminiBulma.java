package day05_matematiksel_islemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {
        // Kullanicidan aldiginiz 4 basamakli bir sayinin rakamnlar toplanmini bulunuz.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli rakamlari birbirinden farkli bir tam sayi giriniz");
        int sayi=scan.nextInt();


        int rakam=0;
        int rakamlarToplami=0;

        rakam= sayi%10; //2
        rakamlarToplami += rakam; //2
        sayi/=10; //bu islem ile sayiyi 753 haine getiriyoruz

        rakam= sayi%10; //3
        rakamlarToplami += rakam; //5
        sayi/= 10; //75 haline geldi

        rakam= sayi%10; //5
        rakamlarToplami += rakam;  //10
        sayi/=10; //7 haline geldi

        rakam=sayi%10; //7
        rakamlarToplami+=rakam; //17
        sayi/=10; //0

        System.out.println("Girdiginiz Sayinin Rakamlar Toplami: " + rakamlarToplami);







    }
}
