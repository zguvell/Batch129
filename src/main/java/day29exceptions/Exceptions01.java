package day29exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

       Object obj = 70;
       String str = "";
       try {
         str = (String) obj; //Birbirine donusturulmeyecek data type'larini donusturmekte israr ederseniz Java ClassCasException atar.
           System.out.println(str);
       }catch (ClassCastException e){
           System.out.println("Her data type'i her data type'ina cevrilmez.");
       }

    }
}
