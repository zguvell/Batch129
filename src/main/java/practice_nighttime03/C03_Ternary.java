package practice_nighttime03;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

    /*
    Kullanicidan sifirdan buyuk pozitif bir tam sayi girmesini isteyin
    Girilen pozitif tam sayi 3 basamkli ise ekrana "3 Basamakli" yazdirin
    3 basamakli degilse cift olup olmadıgını kontrol edin
    Cift ise "3 basamakli olmayan cift sayi " yazdirin
    Cift degilse " 3 basamakli olmayan pozitif tek sayi" yazdirin
     */

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int sayi = input.nextInt();

        //1.YOL:(IF)
        if (sayi>0){
            boolean sifirdanBuyukUcBas = sayi>99 && sayi<1000;
            boolean sifirdanBuyukUcBasOlmayanCift = !(sayi>99 && sayi<1000) && sayi %2 == 0;
            if (sifirdanBuyukUcBas){
                System.out.println("3 basamakli sayi");
            }else if (sifirdanBuyukUcBasOlmayanCift ){
                System.out.println("3 basamakli olmayan pozitif cift sayi");
            }else
                System.out.println("3 basamakli olmayan pozitif tek sayi");

        }else{ //negatif sayilar icin burasi calisir
            System.out.println("Lutfen pozitif bir tam sayi giriniz");
        }//if body

        //2.YOL:(Ternary)
        boolean sifirdanBuyukUcBasTer = sayi>99 && sayi<1000;
        boolean sifirdanBuyukUcBasOlmayanCiftTer = !(sayi>99 && sayi<1000) && sayi %2 == 0;

        String sonuc=sayi>0     ?  sifirdanBuyukUcBasTer?("3 basamaklı sayı"): sifirdanBuyukUcBasOlmayanCiftTer?("3 basamaklı olmayan çift sayı"): ("3 basamaklı olmayan tek sayı"): ("Lutfen pozitif bir tamsayı giriniz");
        System.out.println(sonuc);



    }
}
