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
       // System.out.println(car1.name); // null
    }
}

//✔️ What Happens Here?
//        1️⃣ The default constructor calls the parameterized constructor with "toyota", 564200.
//        2️⃣ The parameterized constructor prints the values but doesn't store them in instance variables (name, price).
//        3️⃣ After constructor execution, when we print car1.name and car1.price, they are still uninitialized (null and 0).