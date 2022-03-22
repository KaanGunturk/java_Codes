package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        // Verieln bir array'de istenen bir elementin var olup olmadıgini true/false yazdirarak gösteren method


        int arr[]={3,5,6,1,9,45,25,4,9,0};

        int istenenSayi=14;

        istenenElemanVarMi(arr,istenenSayi);

        Arrays.sort(arr);
        Arrays.binarySearch(arr,istenenSayi);


    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {


        boolean sonuc=false;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == istenenSayi){
                sonuc=true;
                break;
            }
        }
        System.out.println(sonuc);
    }
}
