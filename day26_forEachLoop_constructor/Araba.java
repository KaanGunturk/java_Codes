package day26_forEachLoop_constructor;

public class Araba {
        /*
        Java'da here Class olusturdugumuzda Java o class'dan ilerida objeler uretmek gerekecegini bilir.
        Biz belirtmeseek de Java her olusturdugu class'a bir constructer koyar.

        Java'nin class olustururken class'a koydugu constructar'a DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez.

        Eger biz gorunuz bir constructor olsun istersek default constructor ile ayni gorevi yapan bir constructor olusturabiliriz,
        veya ayni kaliptan farkli desenlerde objeler olusturmak icin farkliozelliklerde constructorlar da olusturabiliriz.

        constructor'lari birbirindene farklilastiran tek ayricalik kullanilan parametre sayisi ve parametre data turudur.
         */
    public Araba(){
        System.out.println("Parametresiz constructor calisti");
        /*
        bir kod dblogunun method veya constructor olmasindan emin olmak istiyorsak iki seye dikkat etmeliyiz
        1-Constructor ismi class ismi ile ayni olmak zorundadir.(Buyuk harfle)
        2-Constructor'ların return type'i olmaz

        ozetle:
         */


    }
    public Araba(String renk){
        System.out.println(renk + " renki bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }
    public Araba(int yil,String renk){
        System.out.println(yil + " " + renk );
    }
}
