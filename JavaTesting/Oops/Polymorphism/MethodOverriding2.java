package Oops.Polymorphism;

public class MethodOverriding2 {
    void show() {

        System.out.println("I am in first method");
    }
}


    class Car extends MethodOverriding2 {  // we need to use extend
        void show() {

            System.out.println("I am  in second method");
        }
        public static void main(String[] args) {
            Car my_obj = new Car();
            my_obj.show(); // to call same method we have to create different objecct for differenet class.

            MethodOverriding2 my_obj2 = new MethodOverriding2();
            my_obj2.show();
        }
    }



