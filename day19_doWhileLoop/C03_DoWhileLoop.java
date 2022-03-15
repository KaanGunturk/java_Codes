package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //While loop ile 5'den kucuk pozitif tamsayilari yazdiralim
        int input = 3;
        int sayi = 1;


        while (sayi < 5 ){
            System.out.println(sayi);

            sayi++;
        }

        //Ayni soruyu do while loop ile yapalim


        sayi = 1;
        do {
            System.out.println(sayi);

            sayi++;

        }while (sayi < input);

    }
}
