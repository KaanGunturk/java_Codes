package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {


        //Kullanicidan kac sayi toplamak istedigini  alin ve bu sayilarin toplamini yazdirin

        int sayiAdedi=5;

        Scanner scan = new Scanner(System.in);
       int sayi = 0;
       int toplam=0;

        for (int i = 1; i <= sayiAdedi ; i++) {
            System.out.println("Lufen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Girilen " + sayiAdedi + " sayinin toplami : " + toplam);

        //while ile yapalim

        sayi = 0;
        toplam = 0;
        int sayac = 1;

        while (sayac <= sayiAdedi){
            System.out.println("Lufen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println("Girilen " + sayiAdedi + " sayinin toplami : " + toplam);
    }
}
