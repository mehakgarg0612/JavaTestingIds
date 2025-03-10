package Oops.Abstarction;

/*abstract class Vehicle1{
    int tyres;
    abstract void start1();
}

class Car1 extends Vehicle1{
    void start1(){
        System.out.println("starts with key");
    }
}
class Scooter extends Vehicle1{
   void start1(){
        System.out.println("starts with kick");
    }
}

public class Practice {
    public static void main(String[] args) {
        Scooter obj = new Scooter();
        obj.start1();

        Car1 obj2 = new Car1();
        obj2.start1();
    }
}*/

interface A {
    void run();
}
interface B{
    void run2();
}

class C implements A,B{

   public void run(){
        System.out.println("I am in A");
    }

   public void run2(){
        System.out.println("I am in B");
    }
}


class D extends C{
    void inherit(){
        System.out.println("Conttaining all the properties of C class");
    }
}

public class Practice {
    public static void main(String[] args) {

//        C obj = new C();
//        obj.run();
//        obj.run2();

        D obj = new D();
        obj.inherit();
        obj.run();
        obj.run2();
    }
}