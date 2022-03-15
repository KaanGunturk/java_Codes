package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {

        //Kullanicidadn istedigi kadar sayi girmesini isteyin
        //kullanicinin girdigig sayilarin toplami 500'u gecerse "Cok sayi girdiniz" yazdir


        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam=0;

        while (toplam <= 500){
            System.out.println("Lufen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
        }

        System.out.println("Cok sayi girdiniz toplam 500'u gecti : " + toplam + " oldu" );
    }
}
