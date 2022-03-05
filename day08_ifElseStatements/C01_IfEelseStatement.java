package day08_ifElseStatements;

import java.util.Scanner;

public class C01_IfEelseStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

         karakter = Character.toUpperCase(karakter);

        if ((karakter >= 'A' && karakter <= 'Z')  ){

            System.out.println("Girdiginiz karaktere bir harf.");

        } else {

            System.out.println("Girdiginiz karakter harf degil.");
        }
    }
}
