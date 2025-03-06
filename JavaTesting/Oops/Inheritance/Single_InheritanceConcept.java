 package Oops.Inheritance;;


class Animal {
    void name() {

        System.out.println("I am animal class");
    }
}

class Dog extends Animal {
    void property() {
        System.out.println("I am inheriting animal class");
    }
}


public class Single_InheritanceConcept {
    public static void main(String[] args) {
       
        Dog my_object = new Dog();
        my_object.name();
        my_object.property();
    }
}
