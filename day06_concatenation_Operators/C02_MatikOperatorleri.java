package day06_concatenation_Operators;

public class C02_MatikOperatorleri {

    public static void main(String[] args) {

        System.out.println(5+2==8); // False

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8; // True

        System.out.println(sonuc1);

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc2);

        boolean sonuc3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8;

        System.out.println(sonuc3);

}

}
