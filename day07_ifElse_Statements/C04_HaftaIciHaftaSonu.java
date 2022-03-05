package day07_ifElse_Statements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz.");

        String gun = scan.next().toLowerCase(); //girilen gunu kucuk harfe ceviriyor.

        if (gun.equals("pazar" ) || gun.equals("cumartesi"))
        {

        System.out.println("Girilen gun haftasonu");

        }

        if (gun.equals("pazartesi") || gun.equals("sali") ||  gun.equals("carsamba") ||

                gun.equals("perseembe") || gun.equals("cuma")){

            System.out.println("Girilen gun haftaici");

        }

    }
}
