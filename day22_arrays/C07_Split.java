package day22_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        String kelimeler[] =str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Java, gun, gectikce, guzellesiyor]
        System.out.println(kelimeler[1]); // gun

        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce)); //[Java gun ,  guzellesiyor]

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));

    }
}
