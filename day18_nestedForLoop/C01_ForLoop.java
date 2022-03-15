package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        int input = 9;
        int faktoriyel = 1;
        String faktoreiyelAcikyazim = "";

        for (int i = input; i >= 1 ; i--) {

            faktoriyel *=i;


            if (i==input){
                faktoreiyelAcikyazim=faktoreiyelAcikyazim + i;
            }else
                faktoreiyelAcikyazim = faktoreiyelAcikyazim + "*" + i;
        }
        System.out.println(input+"! = " + faktoreiyelAcikyazim + " =" + faktoriyel);
    }
}
