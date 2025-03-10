package Oops.Inheritance;

interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface C extends A {
    void methodC();
}

class D implements B, C {  // Combining multiple inheritance with interfaces
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }

    public void methodC() {
        System.out.println("Method C");
    }
}

public class HybridConcept_Car {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}



