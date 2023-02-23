package day31collections;

import java.util.HashSet;

public class HashSet01 {

    /*
     1)"Hash" bir tekniktir, Java bu teknigi kullanarak benzersiz datalar uretir.
     2)"Set" tekrarsiz data depolamak icin kullanilam bir Collection'dir.
     3)Set tekrar kabul etmez. Yani;tekrarsiz verileri depolamak icin kullanilir.
     "Set" ler 3'e ayrilir;
      i)HashSet: a)Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
                 yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
                 b)HashSet'ler tekrarli elemana musaade etmezler
                 c)HashSet'ler sadece bir tane "null" i eleman olarak kabul ederler.
      ii)LinkedHashSet: a)LinkedHashSet elemanlari "insertion order" a gore dizer.
                        b)LinkedHashSet elemanlari siralamakta zaman kaybettigi icini HashSet' e gore yavastir.
                        c)LinkedHashSet'ler tekrarli elemana musaade etmezler
      iii)TreeSet: a)TreeSet elemanlari "natural order"(kucukten buyuge || alfabetik sıraya gore) a gore dizer.
                   b)TreeSet "natural order" yaparken cok zaman harcar o yuzden en yavas "Set" dir.
                   c)TreeSet'ler tekrarli elemana musaade etmezler
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs);//[5, 234, 12, 78] ==> Gordugunuz gibi elemanlar rastgele siralandi.

        int hc = hs.hashCode();
        System.out.println(hc);//329







    }
}
