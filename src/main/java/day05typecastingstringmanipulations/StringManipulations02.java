package day05typecastingstringmanipulations;

import java.sql.SQLOutput;

public class StringManipulations02 {

    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmediğini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine çeviriniz
        String s1 = s.replace("money","dollar");
        System.out.println(s1);

        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine çeviriniz
        String s2 = s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money

        //Example 4: "s" String'indeki "a" harflerini "*" a çeviriniz
        //Note: replace() method'unda çoklu karakter ile çalışırsanız mecbur çift tırnak kullanacaksınız
        //      Ama tek karakter ile çalışırsanız çift tırnak veya tek tırnak kullanabilirsiniz
        String s3 = s.replace("a","*");
        System.out.println(s3);//Le*rn J*v* e*rn money

        //Note: Ya ikisi de çift tırnak olmalıdır ya da ikisi de tırnak olmalıdır.
        //Example 5: "s" String'indeki "n" harflerini "XXX" a çeviriniz
        String s4 = s.replace("n","XXX");
        System.out.println(s4);//LearXXX Java earXXX moXXXey

        //Example 6: "s" String'indeki tüm "e" harflerini siliniz
        //Note: "Hiçbir şey" char data type'ında yok bu yüzden replace() method'u kullanarak silme işlemi yaparsanız mutlaka çift tırnak kullanınız
        String s5 = s.replace("e","");
        System.out.println(s5);//Larn Java arn mony

        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String'indeki tüm rakamları "*" a çeviriniz
        //Note: Bir grup data'yı değiştirmek için replaceAll() kullanılır
        //Note: Bir grup data'yı ifade etmek için "Regular Expressions" (Regex) kullanılır
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
           Meşhur Regex'ler
           1) Tüm rakamlar ==> [0-9]
           2) Tüm küçük harfler ==> [a-z]
           3) Tüm büyük harfler ==> [A-Z]
           4) Tüm küçük harfler ve büyük harfler ==> [a-zA-Z]
           5) Tüm harfler ve rakamlar ==> [a-zA-Z0-9]
           6) Tüm noktalama işaretleri ==> \\p{Punct}
           7) Tüm sesli harfler ==> [aeiou]
              x,q,w harfleri ==> [xqw]

           8) Küçük harflerden farklı tüm karakterler ==> [^a-z] "^" sembol -den farklı demek
           9) Tüm harflerden farklı tüm karakterler ==> [^a-zA-Z]

        */

        //Example 8: "t" String'indeki tüm rakamları ve harfleri "!" e çeviriniz
        String t2 = t.replaceAll("[0-9a-zA-Z]","!");
        System.out.println(t2);// !!! !! !!!!!!!!!!!...

        //Example 9: "t" String'indeki tüm sesli harfleri "?" e çeviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);// ?l? 13 y?s?nd?d?r!..

        //Example 10: "t" String'indeki küçük harfler dışındaki tüm karakterleri "<>" çeviriniz
        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);// <>li<><><><>yasindadir<><><><>

        //Example 11: "t" String'indeki tüm harfler dışındaki tüm karakterleri "+" çeviriniz
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);// Ali++++yasindadir++++

        //Example 12: "t" String'indeki space'ler dışındaki tüm karakterleri "+" çeviriniz
        String t6 = t.replaceAll("[^ ]","+");
        System.out.println(t6); // +++ ++ ++++++++++++++

        //Example 13: "t" String'indeki sesli harfler dışındaki tüm karakterleri "&" çeviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);// A&i&&&&&a&i&&a&i&&&&&



    }
}
