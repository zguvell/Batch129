package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanıcıdan adresini alınız ve ekrana yazdırınız
        Scanner input = new Scanner (System.in);

        System.out.println("Lütfen adresinizi giriniz...");
        //nextLine() methodu kullanıcıdan çok kelimeli String almak için kullanılır.
        String address = input.nextLine();
        System.out.println(address);
    }
}
