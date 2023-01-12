package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        //Date Class
        Date myDate = new Date();
        System.out.println(myDate);//Sat Jan 07 23:26:35 EET 2023
        System.out.println(myDate.getTime());//1673123444299 ==> 1 Ocak 1970 den su ana kadar ki milisaniye miktari

        //Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());//2023-01-07
        System.out.println(LocalTime.now());//23:34:38.952298

        System.out.println(LocalDateTime.now());//2023-01-07T23:35:55.284797

        //Dunyanin herhangi bir saat dilimindeki zamani nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));//2023-01-07T21:44:32.874921
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:45:38.364455
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-07T23:46:26.261573

        //Ileri ki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geri bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileri ki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));//02:56:21.224730

        //Geri bir zaman nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//23:12:51.968777

        //Zaman'da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//0:1

        //Tarih'de belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:8
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());//1:8

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);//true
        boolean result1 = LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result1);//false

        //Tarih'lerin formatlari nasil degistirilir?
        //M ==> Tek rakamla ay no'sunu yazar - MM ==> Iki rakamla ay no'sunu yazar
        //MMM==> Ay isminin ilk uc harfini yazar - MMMM ==> Ay isminin tamamini yazar

        //d ==> Tek rakamla gun no'sunu yazar - dd ==> Iki rakamla gun no'sunu yazar

        //yy ==> Yilin son iki rakamini yazar - yyyy ==> Yilin tamamini yazar.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println( dtf.format(LocalDate.now()));//08/01/2023
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println( dtf1.format(LocalDate.now()));//08/Oca/2023
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println( dtf2.format(LocalDate.now()));//08/Ocak/2023
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println( dtf3.format(LocalDate.now()));//08/01/23





    }
}
