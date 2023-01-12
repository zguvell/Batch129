package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
          Java'da method nasıl oluşturulur)

          1)main method'un dışında oluşturulur
          2)Acces Modifier + Return Type + Method İsmi +() + {}

          Oluşturulan method'lar nasıl kullanılır?
          1)main method'un içinden kullanılır
          2)method'un ismini + () yazın
          3)İşlem yapacağınız sayıları parantezin içine koyun
     */

    public static void main(String[] args) {

       int sonuc =  add(30,50);
       System.out.println(sonuc);

       long carpmaSonucu = multiply(3,6);
       System.out.println(carpmaSonucu);

       int ucluSonuc = firstTwoMultiplyThirdAdd(2,5,8);
       System.out.println(ucluSonuc);

       double küp = getCube(5);

        System.out.println(küp);

    }

    public static int add(int a, int b){
        return a+b;
   }

    protected static long multiply(int a, int b){
      return a*b;
   }

   //Örnek 1: Verilen 3 sayıdan ilk ikisini çarpan ve sonucu üçüncü sayı ile toplayan method'u oluşturunuz ve kullanınız.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
      return a*b+c;
    }

    //Örnek 2: Verilen bir ondalık sayının küpünü hesaplayan methodu oluşturup kullanınız.
    //Note: Access Modifier'ı default yapmak access modifier'ı yazmayınız
     static double getCube(double a){
        return a*a*a;


        //1)Dikdörtgenin alanını hesaplayan methodu oluşturunuz ve kullanınız
        //2)Dikdörtgenin çevresini hesaplayan methodu oluşturunuz ve kullanınız
        //3)Dairenin çevresini hesaplayan methodu oluşturunuz ve kullanınız
        //4)Dairenin alanını hesaplayan methodu oluşturunuz ve kullanınız
    }

}
