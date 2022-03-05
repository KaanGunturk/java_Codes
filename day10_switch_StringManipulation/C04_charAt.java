package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java Cok Guzel";

        // j yi yazdiralim
        System.out.println(str.charAt(0));

        // G'yi yazdiralim.
        System.out.println(str.charAt(9));

        System.out.println(""+str.charAt(2)+str.charAt(3));

        System.out.println(str.toLowerCase().charAt(5)+
                          ""+str.toUpperCase().charAt(6)+
                          str.toUpperCase().charAt(7));

        //son harfi yazdir
        //string'de 14 harf var 14-1
        System.out.println(str.charAt(14-1));

        // Bu calisirsa hata verir String index out of range: 14 System.out.println(str.charAt(14));
    }
}
