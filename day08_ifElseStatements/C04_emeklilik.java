package day08_ifElseStatements;

import java.util.Scanner;

public class C04_emeklilik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +
                "\nKadin icin K \nErkek İçin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K'){

            if (yas < 0 || yas > 120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");

            } else if (yas < 60 ){
                System.out.println("Emekli olamazsın \nDaha "+ (60-yas) + " yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin.");
            }

        } else if (cinsiyet == 'E'){

            if (yas < 0 || yas > 120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");

            } else if (yas < 65 ){
                System.out.println("Emekli olamazsın \nDaha "+ (65-yas) + " yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin.");
            }

        }else {


            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }




    }
}
