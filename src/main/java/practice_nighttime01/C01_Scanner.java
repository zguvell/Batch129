package practice_nighttime01;

import java.util.Scanner;

public class C01_Scanner {

    /*

    TechProEd spor salonu icin kullanicidan isim; soyisim; yas;
    kilo;boy;salona devam edecegi ay suresi bilgilerini alip aylik 20 $
    olarak toplam ucreti yazdiriniz

     */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("TechProEd spor salonuna hosgeldiniz....");
        System.out.println("Lutfen adinizi soyadinizi giriniz...");
        String tamIsim =input.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo=input.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        int aylik_Ucret =20;
        System.out.println("aylik_Ucret = " + aylik_Ucret+" $");

        System.out.println("Lutfen uyelik suresini giriniz");
        int aylik =input.nextInt();

        int toplam_tutar =aylik_Ucret*aylik;
        System.out.println("toplam_tutar = " + toplam_tutar+" $");

        System.out.println("tamIsim = " + tamIsim+ "\nYasiniz : "+yas+"\nKilo : "+kilo+"\nBoy : "+boy+
                "\nOdemeniz gereken toplam tutar : "+toplam_tutar+" $");







    }




}
