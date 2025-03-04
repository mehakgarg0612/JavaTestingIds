package Constructor;

public class CopyConstructor_Car {
    String name;
    int price;

    CopyConstructor_Car(String name , int price){
        this.name = name;
        this.price = price;
    }

    CopyConstructor_Car(CopyConstructor_Car copy1){// copy1 : A variable (parameter) that stores the object passed into the constructor
        this.name = copy1.name;
        this.price = copy1.price;
    }

    public static void main(String[] args) {
        CopyConstructor_Car car1 = new CopyConstructor_Car("Toyota", 98856);
        System.out.println(car1.name);
        System.out.println(car1.price);

        CopyConstructor_Car car2 = new CopyConstructor_Car(car1);
        System.out.println(car2.name);
        System.out.println(car2.price);

    }
}
