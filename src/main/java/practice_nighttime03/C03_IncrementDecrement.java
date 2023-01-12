package practice_nighttime03;

public class C03_IncrementDecrement {
    public static void main(String[] args) {

        int a = 12;
        int b = a++;//Post Increment (Sonradan Arttırma)
        System.out.println(b); //12
        System.out.println(a); //13
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int x = 15;
        int y = x--;//Post Decrement
        System.out.println(x); //14
        System.out.println(y); //15
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int m = 21;
        int n = ++m;//Pre Increment
        System.out.println(m); //22
        System.out.println(n); //22
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int t = 32;
        int u = --t;// Pre Decrement
        System.out.println(t); //31
        System.out.println(u); //31
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int sayi = 10;
        sayi++;
        System.out.println(sayi); //11
        sayi++;
        System.out.println("pre-incrementten once " + sayi); //12
        System.out.println(" pre-increment satırında " + ++sayi); //13
        System.out.println("pre-incrementden  sonra" + sayi); //13

        System.out.println("post-increment satırında" + sayi++); //13
        System.out.println("post-incrementdan sonra " + sayi); //14
        System.out.println(9f / 2f); //4.5
        System.out.println(9 / 2); //4

///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int num = 15;
        int num2 = num++;
        System.out.println(num2); //15
        System.out.println(num); //16

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++;
        System.out.println(sayi1 + "," + sayi2 + "," + sayi3); //11,10,30

        sayi3 = ++sayi1;
        System.out.println(sayi1 + "," + sayi2 + "," + sayi3); //12,10,12

        System.out.println(sayi3++); //12

        System.out.println(--sayi2); //9

        System.out.println(sayi3++); //13

        System.out.println(sayi3); //14
    }//main
}
