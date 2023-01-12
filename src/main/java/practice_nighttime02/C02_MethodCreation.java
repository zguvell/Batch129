package practice_nighttime02;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz
        System.out.println("Dikdortgenin Alani:"+ dikdortgeninAlani(10, 5));
        System.out.println("Dikdortgenin Cevresi:"+ dikdortgeninCevresi(12, 45));
        kareninAlani(25);

    }//main
    /*
       Access    static      datatype methodismi(parametreler)
       modifier
     */

        public    static      int dikdortgeninAlani(int a, int b){
        return a*b; //carpmanin sonucunu kullaniciya verdim //Dikdortgenin Alani:50
    }//methodBody

    //Dikdortgenin cevresini hesaplayan kodu yaziniz ve kullaniniz

    public static int dikdortgeninCevresi(int a, int b){
            return 2*(a+b);//Dikdortgenin Cevresi:114

    }//methodbody

    //Karenin alanini hesaplatan kodu yaziniz

    public static void kareninAlani(int a){
        System.out.println("Karenin Alani:"+ (a*a));//Karenin Alani:625
    }

    }//class








