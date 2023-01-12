package practice_nighttime04;

import java.util.Arrays;

public class S04 {


    public static void main(String[] args) {

        int arr[][] = { {68,5984,461},{968,3566,0} };
        for (int i = 1;  i < arr.length ;               i++) {

            for (int k = 1;     k < arr[0].length;           k++) {

                if (arr[i][k] % 2 == 1){

                    arr[i][k] = arr[i][k] + 1;
                }
                if (arr[i][k] % 2 == 0){

                    arr[i][k]  =   arr [i] [k]  *  2;

                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }//main
}//class

// Ekran ciktisi nedir?

