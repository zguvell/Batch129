package day05typecastingstringmanipulations;

public class TypeCasting01 {
    /*
      Numeric primitive data type'larının birbirine dönüştürülmesine "Type Casting" denir.
      Numeric Data Type'lar byte-short-int-long-float-double
      Note 1: Küçük data type'larını büyük data type'larına çevirmeyi Java otomatik olarak yapabilir.
              Bu işleme "AutoWidening" (Otomatik Genişletme) denir.
      Note 2: Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir,Java bu riskli işi otomatik olarak yapmaz.
              Bu işlemi kod yazanlar yapar.
              Bu işleme "ExplicitNarrowing"(Açıktan daraltma) denir.
     */



    public static void main(String[] args) {

        //byte data type'ını int data type'ına çeviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //long data type'ını short data type'ına çeviriniz
        long weight = 234;
        short weightShort =(short) weight;//ExplicitNarrowing

        //int data type'ını float data type'ına çeviriniz
        int population = 700000;
        System.out.println(population);
        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type'ını short data type'ına çeviriniz
        double number = 12.934;
        System.out.println(number);//12.934
        short numberShort = (short)number;
        System.out.println(numberShort);//12

        //Dikkat!
        //Dönüşüm yaptığınız sayı(260), dönüştüreceğiniz data type'ının sınırları dışında ise, Java kullandığınuz sayı ile
        //"mod" işlemi yapar ve işlemin sonucu sizin yeni değeriniz olur
        //Example 1:
        short num =260;
        System.out.println(num);//260
        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //Example 2:
        short n = 1023;
        System.out.println(n);//1023
        byte nByte = (byte)n;
        System.out.println(nByte);//-1



    }
}
