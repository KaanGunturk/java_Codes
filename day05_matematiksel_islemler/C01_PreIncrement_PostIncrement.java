package day05_matematiksel_islemler;

public class C01_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println(sayi);

        System.out.println(++sayi);//once arttır sonra yazdır
        System.out.println(sayi); //13

        System.out.println(sayi++); //13
        System.out.println(sayi);   //14
}
}


