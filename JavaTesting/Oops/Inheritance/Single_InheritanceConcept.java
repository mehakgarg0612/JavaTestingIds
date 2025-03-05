 package Oops.Inheritance;;


class Animal {
    void eat() {
        System.out.println("I am eating food");
    }
}

class Dog extends Animal {
    void beat() {
        System.out.println("I am eating good");
    }
}


public class Single_InheritanceConcept {
    public static void main(String[] args) {
       
        Dog my_object = new Dog();
        my_object.eat();
    }
}
