package practice_nighttime04;

public class S05 {
    public static void main(String[] args) {

        int[][] x = {{82, 1}, {0, 70, 80}};

        System.out.println(m(x[1]));
    }
    public static int m(int[] m) {

        int result = m[1];

        for (int i = 0; i < m.length;                   i++){

            result += m[i];

        }

        return result;

    }
}

// Ekran ciktisi nedir?

