package practice_nighttime07;

public class HacimRunner {

    public static void main(String[] args) {

        //Küp, kare prizma ve dikdörtgen prizmanın
        // hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız

        Hacim hacim = new Hacim();

        int karePrizma = hacim.hacimHesapla(5,6);
        int dikdortgenPrizma = hacim.hacimHesapla(5,6,7);
        int kup = hacim.hacimHesapla(5);

        System.out.println("kup = " + kup);//kup = 125
        System.out.println("dikdortgenPrizma = " + dikdortgenPrizma);//dikdortgenPrizma = 210
        System.out.println("karePrizma = " + karePrizma);//karePrizma = 150



    }
}
