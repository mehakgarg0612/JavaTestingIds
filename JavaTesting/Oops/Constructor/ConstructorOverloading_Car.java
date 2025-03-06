package Oops.Constructor;

public class ConstructorOverloading_Car {
    String name;
    int price;
    String type;

    ConstructorOverloading_Car(String name , int price){
        this.name = name;
        this.price = price;
    }

    ConstructorOverloading_Car(String name, int price , String type)
    {
        this.name = name;
        this.price = price; 
        this.type = type;
    }

    public static void main(String[] args) {
        ConstructorOverloading_Car car1 = new ConstructorOverloading_Car("Toyota", 9870000);
        System.out.println(car1.name);
        System.out.println(car1.price);
        System.out.println(car1.type);

        ConstructorOverloading_Car car2 = new ConstructorOverloading_Car("Toyota", 9870000,"Petrol");
        System.out.println(car2.name);
        System.out.println(car2.price);
    }
    }


/*public class Box {

    int length;
    int breadth;
    int height;

    //square
    Box(int  length , int breadth){
        this.length = length;
        this.breadth = breadth;
        System.out.println("Product of square is : " + (length * breadth));
    }

    // rectangle
    Box(int length, int breadth , int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        System.out.println("Product of rectangle is : " + (length * breadth * height));
    }
    public static void main(String[] args) {

        Box box1 = new Box(5,6,7);  //Multiple constructors with different parameter lists.
        Box box2 = new Box(5,6);

    }
} */



    

