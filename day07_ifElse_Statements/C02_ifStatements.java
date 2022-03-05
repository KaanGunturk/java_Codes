package day07_ifElse_Statements;

public class C02_ifStatements {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;


        if (a<b && b<100){

            System.out.println("isteginiz gerceklesecek");


        }

        if (a>0) System.out.println("suslu parantez olmazsa sadece bir satır calisir");

        //bir if cumlesinin daha anlasilir olmasini istiyorsaniz if body'sini suslu parantez icine yazmalisiniz

        System.out.println("2. satir da calisti"); // bu satirdaki kod suslu parantez olmaigi icin if satiri dogru olsa da olmasa da calisir.
    }
}
