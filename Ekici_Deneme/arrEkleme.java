package Ekici_Deneme;

import java.util.Arrays;

public class arrEkleme {
    public static void main(String[] args) {

        /*Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

            Input1={1,2,3,4}

             Input2={5,6}

            Output={1,2,3,4,5,6}
        */




        int[] arr =   {1,2,3,4,5};
        int[] arr1 =  {5,6};

        arrEkleme(arr,arr1);


    }
    public static void arrEkleme(int[] arr,int[] arr1){

        int[] arr2=new int[arr.length+arr1.length];

        for(int i=0 ; i<arr.length ; i++){
            arr2[i]=arr[i];


        }
        for(int i=0 ; i<arr1.length ; i++){
            arr2[arr2.length-1-i]=arr1[arr1.length-1-i];
        }
        System.out.println(Arrays.toString(arr2));




    }

}