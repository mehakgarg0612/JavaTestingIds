package Oops.Abstarction;

interface Parent1{
    void show();
}

interface Parent2{
    void show1();

}

class Child1 implements Parent1 ,Parent2{
    public void show(){
        System.out.println("I am in parent1 class method");
    }

    public void show1(){
        System.out.println("I am in parent2 class method");
    }
}

public class InterfaceMultipleInheritance {
    public static void main(String[] args) {

        Child1 obj = new Child1();
        obj.show();
        obj.show1();

    }
}
