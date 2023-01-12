package day13whileloopdowhileloop;

public class DoWhileLoop01 {

    public static void main(String[] args) {

       //1)While-loop
       //While loop'da Zero Execution mumkundur.
       int i=1;

       while(i<1){
           System.out.println("Sen bir while loopsun...");
           i++;
       }

       //2)Do-while-loop
       //Do while kullandiginizda loop body en az bir kere calisir.
       //Do while da "zero execution" mumkun degildir.
        int k =1;

       do {
           System.out.println("Sen bir do while loop'sun");
           k++;
       }while (k<1);



    }
}
