package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data tyoe'dır ve aynı zamanda bir class'dır.

    public static void main(String[] args) {

        String s = "Java is easy";
        //Example 1: "s" String'indeki tüm karakterleri büyük harf yapınız
       String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //Example 2: "s" String'indeki tüm karakterleri küçük harf yapınız
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Example 3: "s" String'indeki ilk karakteri alınız
       char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Example 4: "s" String'indeki ikinci ve sondan ikinci karakteri alınız ve ekrana yan yana yazdırınız
        char secondChar = s.charAt(1);//a
        char secondLastChar =  s.charAt(10);//s

       //1.YOL:Aynı satırda yazdırmak için
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.YOL:Aynı satırda yazdırmak için
        System.out.println("" + secondChar + secondLastChar);

        //Example 5: "s" String'inde kullanılan karakter sayısını bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12

        //Example 6: "s" String'indeki ilk 4 karakteri alınız
        //ilk index başlangıç,ikinci index bitimin bir sonrası yazılır
        //substring(0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index hariçtir
        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Example 7: "s" String'indeki "is" kelimesini alınız
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Example 8: "s" String'indeki "easy" kelimesini alınız
        String sub3 = s.substring(8,12);
        System.out.println(sub3);
        //Bir karakterden başlayıp String'in sonuna kadar almak isterseniz, ikinci index'i yazmayınız
        //s.substring(8,12); yeribe s.substring(8); yazınız
        String sub4 =  s.substring(8);
        System.out.println(sub4);

        //Example 9: "s" String'inde "money" kelimesinin var olup olmadığını kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        /*
          Bir methodu öğrenirken 3 şeyi mutlaka öğrenin;
          1)Bu method ne iş yapar?
          2)Bu methodun farklı kullanımları nasıldır?
          3)Bu method size ne return eder?
         */

        //Example 10: "s" String'inin belli bir harf ile başlayıp başlamadığını kontrol ediniz
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Example 11: "s" String'inin 6. karakterden itibaren belli bir harfle başlayıp başlamadığını kontrol ediniz
        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);










    }
}
