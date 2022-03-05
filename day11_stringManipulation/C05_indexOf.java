package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {

    public static void main(String[] args) {

        String str1 = "Java bir baska guzel valla cok guzel";

        System.out.println(str1.indexOf('J'));

        System.out.println(str1.indexOf("l"));
        System.out.println(str1.length()-1);
        System.out.println(str1.indexOf("aska"));

        System.out.println(str1.indexOf("b"));

        System.out.println(str1.indexOf('n' , 5));

        int ilkIndex= str1.indexOf('a');
        System.out.println(str1.indexOf('a' , ilkIndex+1));

        int ilkBindex = str1.indexOf('b');
        System.out.println(str1.indexOf("b" , ilkBindex+1));

        //20. indexten sonra guzel aratalim
        str1.indexOf("guzel" , 20);
        System.out.println(str1.indexOf("guzel" , 20));

        // stringte olmayan bir harf aratsak

        System.out.println(str1.indexOf("y")); // y yok demesi lazim return type index
        // yok demein sayisal karsiligi olarak java -z dondurmeyi tercih etmistir

        //kullanicican mail adresi isteyin @ isareti icermiyorsa gecersiz yadirin
        // iceriyorsaa mailiniz kabul edildi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazin");
        String mail = scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz.");
        } else {
            System.out.println("mailiniz kabul edildi.");
        }

          // ozet : index of method'u icerisinded yazilan string veya char in metinde hangi index'de oldugunu
        // bize dondurur.Eger aradigimiz metin veya char yoksa olmadginin delili olarak bize -1 dondurur.


    }
}
