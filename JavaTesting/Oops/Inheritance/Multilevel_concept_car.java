package Oops.Inheritance;

class Car{
    void name(){
        System.out.println("I am car class");
    }
}

class Toyota extends Car{
    void car_name_one(){
        System.out.println("My car name is Toyota");
    }
}
class Kia extends Toyota{
    void car_name_two(){
        System.out.println("My car name is Kia ");
    }
}


public class Multilevel_concept_car{
    public static void main(String[] args) {
        Kia my_object = new Kia();
        my_object.name();
        my_object.car_name_one();
        my_object.car_name_two();

    }
    
}
