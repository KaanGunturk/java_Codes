package Ekici_Deneme;

public class asal {
    public static void main(String[] args) {

        int num = 1;


        if (asalMi(num)){
            System.out.println("asal");
        }else {
            System.out.println("asal degil");
        }
    }

    private static boolean asalMi(int num) {

        boolean asal=true;

        for (int i = 2; i < num; i++) {

            if (num%i==0){
                asal=false;
                break;

            }
        }
        return asal;
    }
}
