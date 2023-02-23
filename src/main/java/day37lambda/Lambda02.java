package day37lambda;

import day36lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {

    /*
      AnyMath: Verecegimiz sarta bagli olarak Stream icerisinde gezinir ve
               herhangi bir elemanla eslesme durumunda true donecektir.

      AllMatch: Verilen sarta gore Stream icerisindeki tum elemanlarin
                bu sarta uymasi durumunda true donecektir.

      NoneMatch: Sarta gore Stream icindeki hicbir
                 elemanin sarti saglamamasi durumunda true donecektir.
     */

    public static void main(String[] args) throws IOException {

      //1)LambdaTextFile dosyasi icindeki metni console'a yazdiran kodu yaziniz.
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

      //2)LambdaTextFile dosyasi icindeki her karakteri uppercase yapiniz.
        Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

     //3)LambdaTextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz.
        boolean result = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                anyMatch(t->t.contains("Java"));
        System.out.println(result);

     //4)LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t->t.contains("a"));//Her kelime "a" harfini icerirse sonuc true olur aksi halde false olur.
        System.out.println(result2);

     //5)LambdaTextFile dosyasi icindeki hicbir kelimenin "x" icermedigini gosteren kodu yaziniz.
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t->t.contains("x"));
        System.out.println(result3);

     //6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz
         long result4 =  Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                count();
        System.out.println(result4);

        //2.yol tavsiye edilmez
        int result5 =  Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                collect(Collectors.toList()).
                size();
        System.out.println(result5);
    }
}
