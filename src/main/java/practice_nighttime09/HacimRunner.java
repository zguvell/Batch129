package practice_nighttime09;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HacimRunner {

    public static void main(String[] args) {

      KarePrizma karePrizma = new KarePrizma();
      double karePrizmaHacmi = karePrizma.hacimHesapla(5,6);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        NumberFormat obj = new DecimalFormat(".00");
        Koni koni = new Koni();
        double koniHacmi = koni.hacimHesapla(3,5);
        System.out.println("koniHacmi = " + obj.format(koniHacmi));

        /*
         NumberFormat class'indan bir object olusturup DecimalFormat(".00") yazdigimizda virgulden sonra 2 basamak yazdirir.
         NumberFormat class'indan bir object olusturup DecimalFormat(".000") yazdigimizda virgulden sonra 3 basamak yazdirir.
         */

        Silindir silindir = new Silindir();
        double silindirHacmi = silindir.hacimhesapla(1,5);
      System.out.println("silindirHacmi = " + obj.format(silindirHacmi));




      }


    }

