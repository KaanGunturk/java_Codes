package day07_ifElse_Statements;

import java.util.Locale;
import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi= scan.next().toUpperCase(); //girilenin buyuk olması komutunu verdigimiz icin sout icine buyuk harfli yazilmalidir.

        if (gunIsmi.equals("PAZAR" ) || gunIsmi.equals("CUMARTESİ"))
        {

            System.out.println("Girilen gun haftasonudur.");

        }
        else {
            System.out.println("Girilen gun haftaicidir.");
        }


    }
}
