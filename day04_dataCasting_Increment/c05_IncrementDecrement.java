package day04_dataCasting_Increment;

public class c05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi+10);

        System.out.println(sayi);

        sayi=sayi+10;

        System.out.println(sayi);

        System.out.println(sayi=sayi+=10);

        System.out.println(sayi);

        System.out.println(sayi+=10);
        System.out.println(sayi);

        System.out.println("24. satir: "+  sayi++);
        System.out.println("25. satir: " + sayi);
        System.out.println("26. satir: "+  ++sayi);
        System.out.println("27. satir: " + + sayi);
    }
}
