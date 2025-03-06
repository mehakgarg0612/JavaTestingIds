package Oops.Constructor;

import java.lang.reflect.Constructor;

//package Oops.Constructor;

public class ParameterizedConstructor_Car {


    String name; // instance variable
    int price;

    ParameterizedConstructor_Car(String car_name , int car_price){ // parameter name should be different from instance variable name
        name = car_name; // No name conflict, so `this` is not required
        price = car_price;
    }



    public static void main(String[] args) {
        ParameterizedConstructor_Car car1 = new ParameterizedConstructor_Car("toyota" , 2300000);
        System.out.println(car1.name);
        System.out.println(car1.price);

    }
}


/*Summary of Execution Flow:

1. main method starts execution.
2. new ParameterizedConstructor_Car("toyota",2300000) is called.
3. Memory is allocated in the heap.
4.Constructor ParameterizedConstructor_Car(String car_name, int car_price) is invoked.
5.Parameters "toyota" and 2300000 are passed to car_name and car_price.
5.These values are assigned to name and price instance variables.
7.Constructor execution completes.
8.The car1 object now contains "toyota" and 2300000.
9.System.out.println(car1.name); prints "toyota".
10.System.out.println(car1.price); prints 2300000.*/



    
