public class Single_Inheritance_concept {
    void eat(){
        System.out.println("I am eating food");
    }
    
}


class Dog extends Single_Inheritance_concept {
    public static void main(String[] args) {
        Dog my_object = new Dog();
        my_object.eat();
        
    }
}