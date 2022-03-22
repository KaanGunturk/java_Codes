package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {

        String[] arr = {"A" , "B" , "C"};
       List<String> arraydenList = Arrays.asList(arr);

        // Arrayden Liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        // dolayisiyla yeni list ile add(), remove(), clear() gibi method'lar calistirmak
        // istedigimizde Exception olusur
        // arraydenList.addd("J") // UnsupportedOperationExcecption

        System.out.println("17.satirda List : " + arraydenList);

        arr[1]="F";

        System.out.println("21.satirda Array : " + Arrays.toString(arr));
        System.out.println("22.satirda list : " + arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("26.satirda Array : " + Arrays.toString(arr));
        System.out.println("27.satirda list : " + arraydenList);
    }
}
