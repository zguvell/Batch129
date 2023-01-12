package day02datatypesmethodcreation;

public class Variables02 {

    /*
    Non-Primitive Data Types: String bir non-primitive data type'dır.
                              Üretilen her bir class aynı zamanda bir " non-primitive data type" dır.
                              Bu yüzden "non-primitive data type" lar sınırsız sayıdadır denebilir.
                              Non-primitive data typle'ların isimleri büyük harfle başlar.
                              Non-primitive data typle'ların tamamı için Java memory'de aynı miktarda yer ayırır.

      Interview Sorusu: "primitive" ve "non-primitive" data type'ları arasındaki fark nedir?
                        1) "primitive" ler sadece bizim atadığımız değeri içerir,
                           "non-primitive" ler bizim atadığımız değer ve method'lar içerir
                        2) "primitive" ler küçük harfle başlar,"non-primitive" ler büyük harfle başlar.
                        3) "primitive" leri Java üretmiştir ve 8 tanedir,
                           "non-primitive" leri Java ve developerlar üretebilir,sınırsız sayıdadır.
                        4) "primitive" ler memory'de data type'ına göre yer kaplar,
                           "non-primitive" ler için Java memory'de hep aynı büyüklükte yer ayırır.
     */
    public static void main(String[] args) {

        //Örnek 1: Şehir ismi için bir variable oluşturun ve bir değer atayıp onu ekrana yazdırın
        String cityName = "Miami";
        System.out.println(cityName);

    }


}
