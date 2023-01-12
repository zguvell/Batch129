package day10switchloops;

public class Loops02 {

    public static void main(String[] args) {

    //Example 1: 21'den 180'e kadar hem 4 hem de 6 ile bölünebilen tam sayilari ekrana yazdiran kodu yaziniz
    for (int i=21; i<181; i++){
        if (i%4==0 && i%6==0){
            System.out.println(i + " ");
          }
        }

    //Example 2: Size verilen kucuk harfle yazilmis Strin'in index i cift sayi olan karakterlerini buyuk harf yapiniz
    //           ankara ==> AnKaRa
    //Note: Yazdiginiz code belli senaryolar icin calısıyor, tum senaryolar icin calismiyorsa;
    //bu code a "hard code" denir. Hard code yanlis yazilmis code dur. Mutlaka duzeltilmelidir.
    //Note: Bir String'de son index = length() - 2
        String s = "ankara";

        for (int i=0; i<s.length(); i++){
            String ch = s.substring( i, i+1);

            if (i%2==0){
                System.out.println(ch.toUpperCase());

            }

        }





    }
}
