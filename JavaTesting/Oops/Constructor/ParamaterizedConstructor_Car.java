package Constructor;

 //package Oops.Constructor;

public class ParamaterizedConstructor_Car {


    String name; // instance variable
    int price;

    ParamaterizedConstructor_Car(String car_name , int car_price){ // parameter name should be different from instance variable name
        name = car_name; // No name conflict, so `this` is not required
        price = car_price;
    }



    public static void main(String[] args) {
        ParamaterizedConstructor_Car car1 = new ParamaterizedConstructor_Car("toyota" , 2300000);
        System.out.println(car1.name);
        System.out.println(car1.price);

    }
}





    
