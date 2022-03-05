package day07_ifElse_Statements;

import java.util.Scanner;

public class C03_tekCiftSayi {
    public static void main(String[] args) {

        //tek mi cift mi

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi % 2 == 0){

            System.out.println("Girilen sayi cifttir.");
        }

        if (sayi % 2 != 0){

            System.out.println("Girilen sayi tektir.");


        }

        //=============== if else ile cozum===================

        if (sayi%2==0){
            System.out.println("Girdiginiz sayi cift sayidir.");
        } else {
            System.out.println("Giridiginiz sayi tek sayidir");
        }
    }
}
