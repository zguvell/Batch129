package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz");
        int number =input.nextInt();
        //Bir sayının son rakamını alabilmek için o sayıyı 10 a bçlün kalana bakın
        //Bir tam sayıyı bir tam sayıya bölerseniz java sonucu kesinlikle tam sayı yapar
        //Java sonucu nasıl tam sayı yapar?
        //Ondalık kısmı iptal eder
        //Java yuvarlama işlemi yapmaz

        //Son rakamı al
        int lastDigit = number%10;
        number = number/10;

        //Sondan ikinci rakamı al
        int lastSecondDigit = number%10;
        number = number/10;

        //Sondan üçüncü rakamı al
        int lastThirdDigit = number%10;
        number = number/10;

        //Sondan dördüncü rakamı al
        int lastFourthDigit = number%10;
        number = number/10;

        //Sondan beşinci rakamı al
        int lastFifthDigit = number%10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);



    }
}
