package day12_stringManipulation;

public class C03_contains {

    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin


        String email = "kagangntrk@gmail.com";
        String arananMetin = "@gmail.com";


        // ! isareti boolean ters haline ecevirir
        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");

        }else if (email.lastIndexOf(arananMetin) == email.length()-10){  //emailin icinde aranan metinin girilen metnin sondan 10. harfi ile ayni olamsi lazim
            System.out.println("Email adresiniz kaydedildi");

        }else{
            System.out.println("lutfen yazimi kontol edin");
        }

    }
}
