package Constructor;

 //package Oops.Constructor;

// public class Car {


//     String name; // instance variable
//     int price;

//     Car(String car_name , int car_price){ // parameter name should be different from instance variable
//         name = car_name; // No name conflict, so `this` is not required
//         price = car_price;
//     }



//     public static void main(String[] args) {
//         Car car1 = new Car("toyota" , 2300000);
//         System.out.println(car1.name);
//         System.out.println(car1.price);

//     }
// }


// Through "this" keyword

public class Car{

    String name;
    int price;
    String brand;

    Car(String  name, int price){
       this.name = name;
       this.price = price;
    }

    void display(){
        System.out.println("The car name is: " + name );
    }

public static void main(String[] args) {

    Car car1=new Car("Kunal" , 987000);
    System.out.println(car1.name);
    System.out.println(car1.price);
    car1.display();
 }
}
