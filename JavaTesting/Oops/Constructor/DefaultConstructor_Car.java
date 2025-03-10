package Oops.Constructor;


public class DefaultConstructor_Car {
    String name = "kia";
    int price = 987;

    DefaultConstructor_Car(){
        
    }
    

    public static void main(String[] args) {
        DefaultConstructor_Car  car1 = new DefaultConstructor_Car();
        System.out.println(car1.name);
        System.out.println(car1.price);
    }
    
}
