public class Animal_Multilevel_Inheritance_concept {
    void dog(){
        System.out.println("Method of dog");
    }
    
}

class Dog extends Animal_Multilevel_Inheritance_concept{
    void color(){
        System.out.println("Color of dog is black");
    }
}

class Cat extends Dog{
    void milk(){
        System.out.println("This is cat method");
    }
}

class Main{
    public static void main(String[] args) {
        Cat myObject = new Cat();
        myObject.milk();
        myObject.color();
        myObject.dog();
    }
}


