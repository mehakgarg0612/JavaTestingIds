package Oops.Abstarction;

abstract class Vehicle{
    int no_of_tyrres;
   abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("start with key");
    }
}
class Scotter extends Vehicle{
    void start(){
        System.out.println("starts with kick");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();

        Scotter obj = new Scotter();
        obj.start();

    }
}
