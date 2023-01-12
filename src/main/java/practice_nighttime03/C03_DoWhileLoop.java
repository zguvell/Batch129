package practice_nighttime03;

public class C03_DoWhileLoop {
      /*
        INTERWIEW QUESTIONS
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

        */

    public static void main(String[] args) {
        int numberofbananas=165;  //4  8    12      ... 164  ==> geriye 1 muz kaldiYasamasi icin yeterli degil
        int survivalDays=1;      //1   2    3        .. 41   ==> 42.oldu
        boolean monkeyAlive=true;


        do {
            System.out.println(" ******** maymunlar yasamak icin gunde 4 muz yer ******************");
            numberofbananas-=4; //  numberofbananas = numberofbananas-4;
            System.out.println("Kalan muz Sayisi "+numberofbananas);
            survivalDays++;
            if(numberofbananas<4){
                monkeyAlive=false;
                System.out.println("Bugun "+survivalDays+". gun yetrli muz kalmadi.Maymun sizlere omur");
                System.out.println("Maymun "+survivalDays+". gun oldu");
            }else
                System.out.println("Bugun "+survivalDays+". gun Maymun yasiyor");

        }while(monkeyAlive);

    }

}










