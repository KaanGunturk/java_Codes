package Ekici_Deneme;

public class ekok {

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 3;
        int ekok=0;

        for (int i = 1; i <= num1*num2 ; i++) {
            if (i % num1 ==0 && i % num2 ==0){
                ekok=i;
                break;
            }
        }
        System.out.println(ekok);
    }
}