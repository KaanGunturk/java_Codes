package interview;

import java.util.Arrays;
import java.util.Scanner;

public class Questions1 {

    /*
    Kullanicidan vir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdieinizi.
    Ornek: alacan ==> a=3,l=1,c=1,n=1
           abaa ==> a=3,b=1
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = scan.nextLine();

        String[] arr= str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter=0;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                counter++;
            }else{
                System.out.println((counter+1) + " tane " +  arr[i-1] + " harfi vardir ." );
                counter= 0;
            }
            if (i==arr.length-1){
                System.out.println((counter+1) + " tane " +  arr[i] + " harfi vardir ." );
            }

        }
    }
}
