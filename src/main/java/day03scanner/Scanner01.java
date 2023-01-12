package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    //Kullanıcıdan data alıp kodlarımızda kullanacağız
    //Objenin ismini "input" ysptım çünkü bu obje kullanıcıdan alınan datayı benim kodlarımın içine koyacak
    //System.in ==> Sistemin içine koy demek

    public static void main(String[] args) {
        //1.adım: Scanner Class'dan object oluştur.
        Scanner input = new Scanner(System.in);
       //2. adım: Kullanıcıya ve istediğinize dair mesaj veriniz
        System.out.println("Lütfen yaşınızı giriniz...");
       //3.adım: Uygun methodu kullanarak kullanıcının verdiği datayı memory'e yerleştiriniz
        byte age = input.nextByte();

        System.out.println(age);
    }

}
