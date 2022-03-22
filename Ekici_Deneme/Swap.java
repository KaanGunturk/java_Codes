package Ekici_Deneme;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println("Before swapping a= " + a + "b= " + b );

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping a= " + a + " b= " + b );
    }
}
