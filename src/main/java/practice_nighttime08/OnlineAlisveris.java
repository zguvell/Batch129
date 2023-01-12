package practice_nighttime08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisveris {

    static List<String>urunListesi = new ArrayList<String>();
    static List<Double>urunFiyatlari = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Basit bir online alisveris programi yaziniz.
         *
         * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
         * 4. Adim : Alisveris bitince online sitenin kurulusGunu ise ucret alma;
         *   degilse toplam odemesi gereken tutari goster.

         * */
        urunListesi.add("ayakkabi : urun kodu : 1 ");
        urunListesi.add("canta : urun kodu : 2 ");
        urunListesi.add("saat : urun kodu : 3 ");
        urunListesi.add("bilezik : urun kodu : 4 ");
        urunListesi.add("toka : urun kodu : 5 ");

        urunFiyatlari.add(10.0);
        urunFiyatlari.add(20.0);
        urunFiyatlari.add(30.0);
        urunFiyatlari.add(15.0);
        urunFiyatlari.add(60.0);

        System.out.println("urunFiyatlari = " + urunFiyatlari);

        System.out.println("urunListesi = " + urunListesi);

        musteriSecim();

    }//main

    private static void musteriSecim() {
        System.out.println("Lutfen sectiginiz urunun kodunu giriniz");
        int secim = input.nextInt();
        System.out.println("Sectiginiz urunden kac adet alacaksiniz");
        int adet = input.nextInt();

        double urunTutari= adet*urunFiyatlari.get(secim-1);
        //get() index ile calistigi icin secim -1 yapariz
        toplamOdeme+=urunTutari;
        System.out.println("Alisverise devam ise 1 : \nOdeme icin 2 : basin");
        int devamMi= input.nextInt();

        if(devamMi==1){
            musteriSecim();//recursiveMethod
        }else{
            odeme();
        }




    }//musteriSecim()

    private static void odeme() {
        LocalDate kurulusGunu= LocalDate.of(2023,02,11);
        LocalDate date = LocalDate.now();

        if(date.isEqual(kurulusGunu)){
            System.out.println("Bugun bizim acilis yil donumumuz Borcunuz yoktur");
        }else
            System.out.println("Yine bekleriz Odemeniz gereken tutar : "+toplamOdeme+"$");

    }//odeme()
}//class







