package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        //verilen 2 harf ve aralarindaki harfleri yazdiran bir kod yaziniz.

        char ilkHarf = 'a';
        char sonHarf = 'z';

        for (char i = ilkHarf; i < sonHarf ; i++) {


            if (ilkHarf < sonHarf){
                System.out.print(i + " ");

            }else{
                System.out.println("Lutfen alfabetik siraya gore giriniz");
            }

        }

        double baslangic = 10;
        double bitis = 20;
        double artis = 0.2;

        for (double i = baslangic; i < bitis ; i++) {
            System.out.print(i);
        }
    }
}
