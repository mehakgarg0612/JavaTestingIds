package Oops.Constructor;

class A{
    int a = 10;

}
class B extends A{
    int a = 20;

    void show(int a){
        System.out.println(a); // 30
        System.out.println(this.a); //current reference of class object i.e class B
        System.out.println(super.a); // reference to the object of parent class i.e class A
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(30);
    }
}
