package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable oluşturmak
        //Java cümlesi = Statement
        //Java'da eşittir demek "==". Yani Matematik'te "=", Java'da "=="
        //Java'da "=" "assigment operator" dır. Sağdaki değeri alır soldaki kutuya kutar
        //Access Modifier yazmazsanız "access modifier" "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assigment Operator (Atama Operatörü) + Variable değeri ==> Assigment
        //Eğer Variable Declaration yapar, Assigment yapmazsanız Java kendi değerlerini (default) koyar.
        //Default değerler sayılar için sıfırdır.
        //Data Type 'ını yazınız    Variable ismi yazınız     Assigment Operator(Atama Operatörü)     Variable Değeri
                 int                           age                          =                                13    ;

        //Örnek 1: Öğrenci ismi için variable oluşturup değer olarak Ali Can atayınız.
        //String'lere verilen değerler çift tırnak içinde olmalıdır.
        //String'ler için "default value" "null" dır.
        String studentName = "Ali Can";

        /*
        Java'da temelde iki tip data varır;
        1)primitive data type:
            char: Tek karakterler için kullanılır. A, x, ?, 5,
            boolean: boolean'lar sadece iki farklı değer alabilir; true(doğru) veya false(yanlış)
            byte: -128 den +127 e kadar tamsayı değerleri için kullanılır (1 byte)
            short: -32768 ile 32767 arasındaki tamsayılar için kullanılır (2 byte)
            int: -2,147,483,648 ile 2,147,483,647 arasındaki sayılar içindir (4 byte)
            long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasındaki sayılar içindir (8 byte)
            float:
            double:
        2)non-primitive data type

        */

        //Örnek: char data type'ında ilk ismin ilk harfi olarak bir variable oluşturunuz ve bir değer atayınız.
        //Note: char data type'ında değerler tek tırnak içine konulmalıdır
        char isminIlkHarf = 'A' ;

        //Örnek 3: boolean data type'ında emeklimisin için bir variable oluşturun ve false değerini atayın.
        boolean emeklimisin = false;

        //Örnek 4: byte data type'ında öğrenci yaşı için bir variable oluşturunuz ve değer atayınız.
        byte studentAge = 23;

        //Örnek 5: Site nufusu için bir variable oluşturup değer atayınız.
        short siteNufusu = 1200;

        //Örnek 6: Ulke nufusları için bir variable oluşturup değer ataması yapınız.
        int countryPopulation = 1864184648;

        //Örnek 7: İnsan vucudundaki hücre sayısı için variable oluşturup değer ataması yapınız.
        //Note: Bir değer long ise sonuna "L"(tercih edilir) veya "l" konulur.
        long cellNumberInHumanBody = 87654321356788L;

        //Eğer Long'a atadığınız değer int'lerin aralığında ise sonuna "L" koymaya gerek yok
        long weightOfSun = 1234567;




    }
}
