package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    //verilen bir listede, istenen iki index'deki elementlerim yerini
    //kalici olarak degistiren bir method olusturun

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=5;

        sayilar= swapElemet(sayilar,ilkIndex,ikinciIndex);
        System.out.println(sayilar);
    }

    private static List<Integer> swapElemet(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // bir tem sayi olusturup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin

        int temp = 0;
        if ((ilkIndex > sayilar.size() - 1) || (ikinciIndex > sayilar.size() - 1)
                || ilkIndex<0 || ikinciIndex<0) {
            System.out.println("Lutfen Gecerli bir index giriniz");
        } else {
            temp=sayilar.get(ilkIndex);
            sayilar.set(ilkIndex,sayilar.get(ikinciIndex));
            sayilar.set(ikinciIndex,temp);
        }
        return sayilar;
    }
}
