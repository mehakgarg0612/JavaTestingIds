/*class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }

    public void PrintColor(){
        System.out.println("Color :" + color);
    }


}*/
class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Apna_college_OOPS {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Mehak";
        student1.age = 12;
        student1.printInfo();

        /*Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.PrintColor();

        Pen pen2 = new Pen();
        pen2.color = "green";
        pen2.PrintColor();

        
        pen1.write();*/
        
    }
}
