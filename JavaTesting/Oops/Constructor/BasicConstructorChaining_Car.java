package Constructor;

// public class BasicConstructorChaining_Car { // through this kweyword
//     String name;
//     int price;
    
//     BasicConstructorChaining_Car(){

//         this("toyota",564200);
//         System.out.println("I am a default constructor");
//     }

//     BasicConstructorChaining_Car(String name , int price){
//         this.name = name;
//         this.price = price;
//         System.out.println("name of the car is: " + this.name + " and the price is : " + this.price);
//     }

//     public static void main(String[] args) {
//         BasicConstructorChaining_Car car1 = new BasicConstructorChaining_Car();
//     }
// }


public class BasicConstructorChaining_Car { // without this kweyword
    String name;
    int price;

    BasicConstructorChaining_Car() {

        this("toyota", 564200);
        System.out.println("I am a default constructor");
    }

    BasicConstructorChaining_Car(String name, int price) {
    
        System.out.println("name of the car is: " + name + " and the price is : " + price);
    }

    public static void main(String[] args) {
        BasicConstructorChaining_Car car1 = new BasicConstructorChaining_Car();
    }
}
