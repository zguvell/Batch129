package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive:       char     -boolean   -byte  -short   -int     -long  -float  -double
        //Wrapper Class:  Character -Boolean   -Byte  -Short  -Integer  -Long  -Float  -Double
        //Wrapper Class'lar non-primitive'dir o yüzden memory de çok yer kaplarlar,o yüzden şart değilse Wrapper Class kullanmayı tercih etmeyiz.

        int n = 12; //"n" yazıp "nokta" koyarsanız hiç method göremezsiniz, çünkü primitive'ler method içermez.
        Integer m = 12;//"m" yazıp "nokta" koyarsanız birçok method görürsünüz, çünkü "wrapper class" lar" method içerir.

        byte p = 23;
        Byte r = 43;

        //Örnek 1: short data type' ının minimum ve maximum değerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Örnek 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);

        //Örnek 3: 1)Primitive int'i Wrapper Integer'a çeviriniz(Autoboxing)
        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22

        //  2)Wrapper Byte'ı primitive byte'a çeviriniz(Unboxing)
        Byte k =43;
        byte primitiveK = k;
        System.out.println(primitiveK);//43

        //Örnek 4: 1)Primitive char'ı Wrapper Character'e çeviriniz.(Autoboxing)
        char initial = 'T';
        Character initialWrapper = initial;
        System.out.println(initialWrapper);

        //         2)Wrapper Boolena'ı primitive boolean' a çeviriniz. (Unboxing)
        Boolean isOld = true;
        boolean isOldWrapper = isOld;
        System.out.println(isOldWrapper);

        //Örnek 5: Size String olan verilen iki fiyatın toplamını ekrana yazdırınız
        String shirt = "2300";
        String shoes = "5200";

        //Java'da "+" sembolü iki sayı arasında kullanılırsa "toplama işlemi" olur.
        //Java'da "+" sembolü iki String arasında veya bir String ve bir sayı arasında kullanılırsa "concatenation işlemi" olur.
        //"concatenation işlemi" birleştirme yaoar
        //Note: Concatenation işlemlerinde Java matematikteki işlem önceliği kurallarını kullanır.
        //İşlem önceliği kuralları: 1)önce üslü sayılar 2)parantez içi 3)çarpma ve bölme 4)toplama ve çıkarma
        System.out.println(shirt+shoes);//23005200

       int toplamFiyat =  Integer.valueOf(shirt) + Integer.valueOf(shoes);

       System.out.println(toplamFiyat);//7500

       //Örnek 6: Size String olarak verilen iki fiyatın toplamını ekrana yazdırınız
       //Note: valuOf() methodu tüm karakterleri rakam olan String'leri sayılara çevirir.
       //    Eğer valueOf() methodu kullanırken String'in içine rakam olmayan bir karakter koyarsanız hata alırsınız.
       //    Bu hatayı düzeltmeyi ileride öğreneceğiz.
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);//$11000$3000
        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);





    }
}
