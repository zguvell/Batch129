package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMaps01 {

    /*
      1)TreeMap entry'leri "key" lere gore "natural order" a koyar.
      2)TreeMap cok yavastiri cunku "natural order" yapmak cok zaman ister.
      3)TreeMap "thread-safe" ve "synchronized" degildir.
      4)TreeMap'lerin "key" lerinde "null" kullanilamaz. Cunku "key" lere gore siralama yaptigi icin "null"ı
      koyacak bir yer olmaz. Ama "value" lardanistediginiz kadar kullanabilirsiniz.
     */

    public static void main(String[] args) {

        long one = System.nanoTime();
        TreeMap<String,Integer> stdAges1 = new TreeMap<>();

        stdAges1.put("Ali",21);
        stdAges1.put("Kemal",19);
        stdAges1.put("Ayse",25);
        stdAges1.put("Murat",22);

        //"key" lere gore alfabetik siralama yapti
        System.out.println(stdAges1);//{Ali=21, Ayse=25, Kemal=19, Murat=22}

        long two = System.nanoTime();

        HashMap<String,Integer> stdAges2 = new HashMap<>();

        stdAges2.put("Ali",21);
        stdAges2.put("Kemal",19);
        stdAges2.put("Ayse",25);
        stdAges2.put("Murat",22);

        System.out.println(stdAges2);//{Ayse=25, Kemal=19, Murat=22, Ali=21}

        long three = System.nanoTime();

        HashMap<String,Integer> stdAges3 = new HashMap<>();

        stdAges3.put("Ali",21);
        stdAges3.put("Kemal",19);
        stdAges3.put("Ayse",25);
        stdAges3.put("Murat",22);

        TreeMap<String ,Integer> stdAges4 = new TreeMap<>(stdAges3 );

        System.out.println(stdAges4);//{Ali=21, Ayse=25, Kemal=19, Murat=22}

        long four = System.nanoTime();

        System.out.println("TreeMap:" + (two-one));//TreeMap:654458
        System.out.println("HashMap:" + (three-two));//HashMap:71959
        System.out.println("HashMap --> TreeMap:" + (four-three));//HashMap --> TreeMap:42833






    }
}
