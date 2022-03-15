package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidadn iki tam sayi alip bu sayilari ve aralarindaki tum tam sayilari yazdiran bir kod


        int baslangic = 40;
        int bitis = 60;


        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");


        //Ayni soruyu while loop ile yapalim

        int i = baslangic;

        while (i <= bitis){

            System.out.print(i + " ");

            i++;
        }
        System.out.println("");
        System.out.println(baslangic);

    }
}
