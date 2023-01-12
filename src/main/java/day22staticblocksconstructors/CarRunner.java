package day22staticblocksconstructors;

public class CarRunner {

    public static void main(String[] args) {

        Car c1 = new Car("BMW","M4",2023,false);
        Car c2 = new Car("Audi","R8",2022,true);
        Car c3 = new Car("Honda","Civic",1999,false);

        System.out.println(c1);//Car{make='BMW', model='M4', year=2023, hybrid=false}
        System.out.println(c2);//Car{make='Audi', model='R8', year=2022, hybrid=true}
        System.out.println(c3);//Car{make='Honda', model='Civic', year=1999, hybrid=false}

        Car c4 = new Car("Mercedes","C300");
        System.out.println(c4);//Car{make='Mercedes', model='C300', year=0, hybrid=false}


    }
}
