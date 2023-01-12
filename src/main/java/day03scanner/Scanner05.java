package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        //1)Alanını hesaplayınız==> kısa kenar * uzun kenar
        //2)Çevresini hesaplayınız==> 2*kısa kena + 2*uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz");
        float shortSide= input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz");
        float longSide= input.nextFloat();

        System.out.println("Alan =" + (shortSide*longSide));
        System.out.println("Çevre =" + (2*shortSide+2*longSide));
    }
}
