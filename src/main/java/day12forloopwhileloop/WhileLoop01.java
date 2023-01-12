package day12forloopwhileloop;

public class WhileLoop01 {

    public static void main(String[] args) {

    //Example 1: 3'den 6'ya kadar tam sayilari console' a yazdiriniz

        //1.YOL: (for-loop)
        for (int i=3; i<7; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.YOL: (while-loop)
        int i=3;

        while (i<7){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: 23'den 12'ye kadar cift tam sayilari console' a yazdiriniz
        int k=23;

        while (k>11){
            if (k%2==0){
                System.out.print(k + " ");

            }
            k--;
        }
        System.out.println();

        //Example 3: Verilen bir tam sayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        //Note:  Sayi %10 her zaman sayinin son rakamini verir
        //1.YOL: while-loop
        int num = 578;
        num = Math.abs(num);
        int sum = 0;

        while(num>0){

           sum = sum + num%10;

            num/=10;
        }
        System.out.println(sum);

        //2.YOL: for-loop
        int a = 684;
        int toplam = 0;

        for (int m = a; m>0; m/=10){
            toplam = toplam + m%10;

        }
        System.out.println(toplam);//18







    }
}
