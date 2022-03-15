package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {

        // verilen iki sayinin toplamini yazdiran bir method
        int sayi1 = 10;
        int sayi2 = 20;

        ikiSayiTopla (sayi1 , sayi2);

        // iki double sayinin toplamini yazdiralim

        double sayi3 = 15.2;
        double sayi4 = 10.3;

        ikiSayiTopla(sayi3 , sayi4);

        //Method olusturmadan
        ikiSayiTopla(15,25);
        ikiSayiTopla(10.1 , 12.3);

        //bir int ile bir double

        int sayi5 = 3;
        double sayi6 = 3.2;

        ikiSayiTopla(sayi5 , sayi6);
    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println("iki double toplami : " + (sayi3+sayi4));
    }

    private static void ikiSayiTopla(int sayi1, int sayi2) {
        System.out.println("İki int toplami : " + (sayi1 + sayi2));

    }
}
