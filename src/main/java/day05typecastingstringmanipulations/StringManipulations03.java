package day05typecastingstringmanipulations;

import java.net.PasswordAuthentication;
import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
          Example 1: Asagıdaki kurallara gore kullanıcının girdiği password u kontrol ediniz
          1) En az 8 karakter olsun
          2) Space karakteri password de olmasin
          3) En az bir tane buyuk harf olsun
          4) En az bir tane kucuk harf olsun
          5) En az bir tane sembol olsun
          6) En az bir tane rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //1) En az 8 karakter olsun
        boolean first = pwd.length()>7;
        System.out.println(first);//Ac123?Sd //true

        //2) Space karakteri password de olmasin
        boolean second = !pwd.contains(" ");
        System.out.println(second);//Ac123?Sd //true

        //3) En az bir tane buyuk harf olsun
        //Note: Buyuk harf olmayanlari sil,kalan karakter sayisina bak,
        // karakter sayisi 0 ise buyuk harf yok demektir
        // sifirdan buyuk ise buyuk harf var demektir
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        //Method'ları aynı satırda yan yana kullanmaya "method chain" denir
        System.out.println(third);//Ac123?Sd //true

        //4) En az bir tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);//Ac123?Sd //true

        //5) En az bir tane sembol olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);//Ac123Sde //false

        //6) En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);//Ac123?Sd //true

        System.out.println("Password gecerli mi ?" + (first && second && third && fourth && fifth && sixth));


    }
}
