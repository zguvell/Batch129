package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    /*
     Iterator'lar Loop'larin yaptigi isi yapar.
     Iterator'lar tipki loop'larda oldugu gibi elemani alarak isleme sokar.
     Java'nin Iterator'lari ortaya cikarma sebebi Infinite Lopp riskini bitirmektir.
     Iterator'larda sonsuz loop yoktur.
     Iterator'lar Java tarafindan sonradan olusturulmuslardir ve loopl'larin yaptiklari butun islemleri yapabilirler.
     Loop'lar ile Iterator'larin performans farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarilidirlar.
     Iki tip Iterator var;
     i)Iterator: Sadece elemanlari remove edebilirsiniz.
                 Sadece soldan saga calisir yani tek yonludur.
     ii)ListIterator: Elemani "remove etme", "update etme" ve "add" yapabilirsiniz.
                      Hem soldan saga hem de sagdan sola calisabilir yani cift yonludur.
     */

    public static void main(String[] args) {

        //Iterator
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        Iterator<String>itr1 = list1.iterator();

        while (itr1.hasNext()){
            itr1.next();
            itr1.remove();
        }
        System.out.println(list1);//[]

        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);//[Ali, Can, Aliye]

        ListIterator<String>listItr = list2.listIterator();
        while (listItr.hasNext()){
            String el = listItr.next();
            listItr.set(el + "!");
        }
        System.out.println(list2);//[Ali!, Can!, Aliye!]


        //Example 2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> lisItr2 = list3.listIterator();

        //Asagidaki loop "pointer" i en saga almak icin yazildi
        while(lisItr2.hasNext()){
            lisItr2.next();
        }

        //Asagidaki loop elemanlari en sondan en basa dogru yazdirmak icin yazildi.
        while(lisItr2.hasPrevious()){
            String el = lisItr2.previous();
            System.out.println(el + " <==");
        }


    }
}
