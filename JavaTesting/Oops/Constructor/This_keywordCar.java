package Oops.Constructor;

public class This_keywordCar {
    String name;
    int price;
    String brand;

    This_keywordCar(String  name, int price){
       this.name = name;
       this.price = price;
    }

    void display(){
        System.out.println("The car name is: " + name );
    }

public static void main(String[] args) {

    This_keywordCar car1=new This_keywordCar("Kunal" , 987000);
    System.out.println(car1.name);
    System.out.println(car1.price);
    car1.display();
 }
}
    

