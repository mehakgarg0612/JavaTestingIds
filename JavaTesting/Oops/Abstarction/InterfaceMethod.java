package Oops.Abstarction;

interface Parent{
    public void show();
}

class Child implements Parent{
   public  void show(){
        System.out.println("I am in child class");
    }
}

public class InterfaceMethod {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
