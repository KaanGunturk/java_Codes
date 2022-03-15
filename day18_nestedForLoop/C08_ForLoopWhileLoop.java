package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopWhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a basitiginda
        // giridigi tum sayilarin toplamini yazdirin


        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam=0;

        for (int i = 0; i < 1000000 ; i++) {
            System.out.println("Lufen bir sayi giriniz");
            sayi = scan.nextInt();

            if (sayi == 0){
                break;
            } else  {
                toplam+=sayi;
            }
        }

        System.out.println("for : " + toplam);

        sayi = 1;
        toplam = 0;

        while (sayi != 0){
            System.out.println("Lufen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("while : " +toplam);

    }
}
