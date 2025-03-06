package Oops.Inheritance;


//without constructor

/* public class Box {

    int length;
    int breadth;
    int height;

    //square
    Box(int  length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    // rectangle
    Box(int length, int breadth , int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public static void main(String[] args) {

        Box box1 = new Box(2,5,1);
        System.out.println(box1.length);
        System.out.println(box1.breadth);
        System.out.println(box1.height);
    }
} */


// with constructor overloading

/* public class Box {

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

        Box box1 = new Box(5,6,7);
        Box box2 = new Box(5,6);

    }
} */


//  with constructor chaining

public class Box {

    int length;
    int breadth;
    int height;


    Box(){
        this(2,3);
        System.out.println("This is a default constructor");
    }
    //square
    Box(int  length , int breadth){
        this(length, breadth ,4);
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

        Box box1 = new Box();
    }
}



