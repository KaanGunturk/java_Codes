package Ekici_Deneme;

public class ebob {
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 9;
        int ebob=0;

        for (int i = 1; i <num1 ; i++) {
            if (num1 % i ==0 && num2 % i ==0){
                ebob=i;
            }
        }
        System.out.println(ebob);
    }
}
