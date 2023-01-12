package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer değiştirmek. 1.kap: Patates 2.kap:Domates ==> 1.kap:Domates 2.kap:Patates


    public static void main(String[] args) {

        int a = 12;
        int b = 5; //Swap'ten sonra ==> a=5 ve b=12
        int temp = 0;

        System.out.println("a:"+a);//12
        System.out.println("b:"+b);//5

        //1.Yol:
        //1.ADIM
        temp = a;
        //2.ADIM
        a = b;
        //3.ADIM
        b = temp;

        System.out.println("a:"+a);//5
        System.out.println("b:"+b);//12

        //2.Yol:
        int x = 12;
        int y = 5;

        x = x + y;
        // 12 + 5 = 17 ==> x=17
        y = x - y;
        // 17 - 5 = 12 ==> y=12
        x = x - y;
        // 17 - 12 = 5 ==> x=5




    }
}
