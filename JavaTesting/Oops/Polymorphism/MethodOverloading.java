package Oops.Polymorphism;

public class MethodOverloading {

    void show(int a , int b){
        System.out.println("I am in first show method");
    }

    void show(int a){
        System.out.println("I am in second show method");
    }
    public static void main(String[] args) {

        MethodOverloading my_obj = new MethodOverloading();
        my_obj.show(5, 6);

    }

}

