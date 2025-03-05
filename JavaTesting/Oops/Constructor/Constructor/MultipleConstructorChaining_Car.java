//package Constructor.Constructor;

public class MultipleConstructorChaining_Car {  //through this keyword
    String name;
    int price;

    MultipleConstructorChaining_Car(){
        this("Toyota");
        System.out.println("I ma default constructor");
    }

    MultipleConstructorChaining_Car(String name){
        this("Toyota" /*name */ , 987660);
        System.out.println("The car name is : " + name);
        

    }

    MultipleConstructorChaining_Car(String name , int price){
        this.name = name;
        this.price = price;
        System.out.println("The car name is : " + name +" the car price is : " + price);
    }
    public static void main(String[] args) {
       MultipleConstructorChaining_Car car1 = new MultipleConstructorChaining_Car(); 
        
    }
}










/*class Temp {       // upper to lower but output is from lower to upper

    Temp() {
        this(5);
        System.out.println("I am a default constructor");
    }

    Temp(int x) {
        this(5, 15);
        System.out.println("Value of x : " + x);
    }

    Temp(int x, int y) {
        System.out.println("Value of x : " + x + " value of y is : " + y);
    }

    public static void main(String[] args) {
        Temp temp1 = new Temp();
    }
} */

/*
 * class Temp { lower to upper but output is from upper to lower
 * 
 * Temp() {
 * 
 * System.out.println("I am a default constructor");
 * }
 * 
 * Temp(int x) {
 * this();
 * System.out.println("Value of x : " + x);
 * }
 * 
 * Temp(int x, int y) {
 * this(5);
 * System.out.println("Value of x : " + x + " value of y is : " + y);
 * }
 * 
 * public static void main(String[] args) {
 * Temp temp1 = new Temp(8, 10);
 * }
 * }
 */