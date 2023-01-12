package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char - boolean - byte - short - int - long - float - double
    //float: Virgüllü sayılar (Ondalık Sayılar - Decimal Numbers) için kullanılır. (Fiyatlandırmalar - 12.99)
    //double: Virgüllü sayılar (Ondalık Sayılar - Decimal Numbers) için kullanılır. (Hücre Ağırlığı: 0.00000000112)

    //Note: primitive data type'larını Java oluşturmuştur, biz oluşturamayız
    //Note: primitive data type'larının isimlerinde sadece küçük harf kullanılır
    //Note: primitive data'lar data type'lara göre memory de farklı farklı yer kaplarlar
    //Note: primitive data'lar içlerinde sadece sizin atadığınız değeri barındırırlar

    public static void main(String[] args) {

        //Örnek 1 : Gömlek ve ayakkabı fiyatları için iki tane variable oluşturup toplam fiyatı ekrana yazdırınız.
        //Note: Java "Decimal Numbers" ı otomatik olarak "double" kabul eder.
        //  Siz data type'ını "float" yazarsanız hata verir.
        //  float olmasında ısrar ediyorsanız sonuna "F" veya "f" koymalısınız.
        // float memory'de 4 byte yer kaplar, double 8 byte yer kaplar.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.out.println() ekrana yazdırır ve "pointer" ı bir sonraki satıra koyar
        //System.out.print() ekrana yazdırır ve "pointer" ı aynı satırda tutar
        System.out.println(shirtPrice + shoesPrice);

        //System.out.println() yazdırmanın kısa yolu ==> "sout" yaz ve Enter'a bas
        System.out.println();

        //Örnek 2: Hücre ağırlığı ve Amip'in ağırlığı için iki tane variable oluşturun ve ağırlıkları farkını ekrana yazdırın
        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;

        System.out.println(weightCell - weightAmip);//8.9E-14 ==>0.000000000000089 => "8.9 çarpı 10 üzeri -14" "E ==> Exponent"


    }

}
