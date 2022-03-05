package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz.");
        int sayi = scan.nextInt();

        if (sayi % 2 ==0 ){
            System.out.println("Girdiginiz sayi cifttir");
        }else {
            System.out.println("Girdiginiz sayi tektir");
        }

        System.out.println(sayi%2 == 0 ? "Sayi cift" : "Sayi tektir" );// Ternary
    }
}
