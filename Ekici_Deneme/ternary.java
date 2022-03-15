package Ekici_Deneme;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");


        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1==sayi2){
            System.out.println("Sayilar birbirine esit");
        }else

        System.out.println((sayi1 > sayi2) ? "sayi1 buyuk" : "sayi2 buyuk");


    }
}
