package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle egiriniz");
        String cumle = scan.nextLine();

        String arr[]=cumle.split(" ");

        System.out.println("Girdiginiz cumlekedi kelime sayisi : " + arr.length);
    }
}
