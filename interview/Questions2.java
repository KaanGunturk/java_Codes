package interview;

import java.util.Scanner;

public class Questions2 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bİr string giriniz :");
        String str = scan.nextLine();
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        ilkSonHarff(str, sayi);
        System.out.println("girilen stringin ilk ve son harfinin istenen sayi kadar birlesik hali :" +ilkSonHarff(str,sayi));

    } //main Sonu

    private static String ilkSonHarff(String str, int sayi) {

        String s = str.substring(0,1) + str.substring(str.length() - 1);
        String b = "";
        for (int i = 1; i <=sayi; i++){
            b+=s ; // b= b+s
        }
        return b;
    }
}