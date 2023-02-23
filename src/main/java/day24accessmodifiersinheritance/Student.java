package day24accessmodifiersinheritance;

public class Student {

   public String name = "Tom Hanks";
   //name herkes tarafindan bilinebilir o yuzden "public" yaptim
   String stdId = "TH2023HU12001";
   //student Id okul yonetimindeki insanlar tarafindan bilinebilir o yuzden "default" yaptim
   protected int accountNum = 76512345;
   //account number ben,esim ve cocuklarim tarafindan bilinebilir o yuzden "protected" yaptim
   private int balance = 123000;
   //hesabimdaki para miktari sadece benim tarafimdan bilinmelidir o yuzden "private" yaptim

   /*
      1)Access modifier'lar genisden dara; public > protected > default > private
      2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler.
      3)Access Modifier'lar ne ise yarar?
      -Variablelara methodlara classlara ulasmayi duzenler.
      4)Kac tane access modifier var ?
       public > protected > default > private
      i)" publicler" icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
      ii)"protected" ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
      iii)"default" sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
      iv)"private" sadece class icinden ulasilabilir,class disina cikildiginda ulasilamaz
      5)protected ile defaultun farki nedir ?
      Package disina ciktigimizda child'lardan" protected"'lara ulasabiliriz. "default"'larda ulasamayiz.

    */

}
