package Ekici_Deneme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int carpim = 1;


        if (sayi<=10){
            for (int i = sayi; i >=1 ; i--) {
                carpim*=i;

            }
            System.out.println(carpim);
        }else {
            System.out.println("Sayi 10 dan kucuk olmali");


        }

    }
}
