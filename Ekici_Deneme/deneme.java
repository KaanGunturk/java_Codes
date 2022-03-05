package Ekici_Deneme;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz.");

        int yil = scan.nextInt();

        if (yil % 100==0){
            if (yil % 500 == 0){
                System.out.println("Artik yil.");


            }
            else {
                System.out.println("Artik yik degil.");

            }
        }

        else {

            if (yil % 4 == 0){
                System.out.println("Artik yil");
            }
            else {
                System.out.println("Artik yil degil.");
            }
        }

    }
}
