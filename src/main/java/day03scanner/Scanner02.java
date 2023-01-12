package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Kullanıcıdan ilk ismini ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("İlk isminizi giriniz...");
        //next() method kullanıcıdan tek kelimeli String almak için kullanılır.
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName+ " " + lastName);




    }
}
