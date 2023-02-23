package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

      List<Integer> myList = new ArrayList<>();

      myList.add(12);
      myList.add(8);
      myList.add(23);
      myList.add(10);
      myList.add(7);

        System.out.println(getSumOfAllElements(myList));//60
        System.out.println();
        System.out.println(getSumFromSevenToSeventy(myList));//2464
        System.out.println();
        System.out.println(getMultiplicationFromThreeToNine(myList));//181440
        System.out.println();
        System.out.println(getMultiplicationFromThreeToNine2(myList));//181440
        System.out.println();
        System.out.println(getFactorial(5));//120
        System.out.println();
        System.out.println(getSumOfEvensBetweenTwoInt(15,4));//50
        System.out.println();
        System.out.println(getSumOfDigitsBetweenTwoInts(12,18));//30

    }

    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer> myList){
        return myList.stream().reduce(Math::addExact).get();
    }

    //Example 2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    public static int getSumFromSevenToSeventy(List<Integer> myList){
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }

    //Example 3: 3'den 9' a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int getMultiplicationFromThreeToNine(List<Integer> myList){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();//rangeClosed() ==> []
    }
    public static int getMultiplicationFromThreeToNine2(List<Integer> myList){
        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();//range() ==> [ )
    }

    //Example 4: Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){
        if (x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else{
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }
    }

    //Example 5: Size verilen 2 tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if (a>b){
            int temp = a;
            a=b;
            b=temp;
        }
      return IntStream.range(a+1, b).filter(Utils::isNumberEven).sum();
    }

    //Example 6:Size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz.
    // 12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8 = 30
    public static int getSumOfDigitsBetweenTwoInts(int a, int b){
        if (a>b){
            int temp = a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1, b).map(Utils::getSumOfDigits).sum();
    }





}
