package day09_ternary_Switch;

public class C05_Ternary {

    public static void main(String[] args) {

        // Bazen terenary'deki iki sonucun data turleri farkli olabilir

        //100'den kucukse "sayi 100'den buyuk olmali" yazdiran bir yernary olusturalim

        int sayi = 50;

        System.out.println( sayi>100 ? sayi*sayi : "sayi 100'den buyuk olmali");

        //Eger sonuclar farli data turlerinde ise
        //atama yapacagimiz variable in data turu tek olacagindan
        //atama yapamayiz SADECE direk yazdirabiliriz


    }
}
