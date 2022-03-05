package day07_ifElse_Statements;

import java.util.Scanner;

public class C07_HaftaninGunleri_IfElseIf {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi = scan.next().toLowerCase();


        if (gunIsmi.equals("PAZAR" ) || gunIsmi.equals("CUMARTESİ")){
            System.out.println("girdiginiz gun haftasonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||  gunIsmi.equals("carsamba") ||
                   gunIsmi.equals("perseembe") || gunIsmi.equals("cuma")){

            System.out.println("Girdiginiz gun hafta ici");

        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }
    }
}
