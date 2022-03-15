package Ekici_Deneme;

import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scanner.nextInt();

        System.out.println( (sayi % 2 == 0) ? "sayi cift" : "sayi tek");
    }
}
