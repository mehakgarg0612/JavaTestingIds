package Oops.Inheritance;

class Car_1{
    void name(){
        System.out.println("I am in class car.");
    }
}

class Toyota_car extends Car_1{
    void name_one(){
        System.out.println("I am Toyota car.");
    }

}

class Kia_one extends Car_1{
    void name_two(){
        System.out.println("I am kia car");
    }
}
public class HierarchicalConcept_Car {
    public static void main(String[] args) {
        Toyota_car my_object = new  Toyota_car();
        my_object.name();
        my_object.name_one();

        Kia_one my_object2 = new Kia_one();
        my_object2.name_two();
        my_object2.name();

    }
}



