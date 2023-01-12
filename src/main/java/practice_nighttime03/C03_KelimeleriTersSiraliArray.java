package practice_nighttime03;

public class C03_KelimeleriTersSiraliArray {

    public static void main(String[] args) {
        /*
          Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
          Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
          tersine çevirmek için kod yazınız.
          Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
          Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
        */
        String str = "Kemal Can Kuzu";
        String arr[]= str.split(" ");
        String tersString = "";

        for (int i = arr.length-1; i >=0 ; i--) {
            tersString+= arr[i] + " ";
        }
        System.out.print("trim basta ise yaradimi");
        System.out.print(tersString);
        System.out.println("trim sonda ise yaradimi");

        System.out.print("trim basta ise yaradimi");
        System.out.print(tersString.trim());
        System.out.println("trim sonda ise yaradimi");
    }

}
