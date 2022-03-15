package day14_stringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

        //4 harfli bir kelimeyi teersten yazdir

        String input = "MAvi";

        String tersStr = input.substring(3) + input.substring(2,3)+input.substring(1,2)+input.substring(0,1);

        System.out.println(tersStr);
    }
}
