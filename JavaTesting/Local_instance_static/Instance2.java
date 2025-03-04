// public class Instance2 {
//     int num = 10; // Instance variable

//     void display() {
//         System.out.print(num);
//     }

//     /*  now in this we declare instance variable in non-static method, which is correct. 
//     But we can't run directly the value of num in main method without making the object of display.
//     Because display is non -static method we can't directly run in main method because it is static. 
//     so to run the display method either we have to make the display static mthod or we can also run by making 
//     the object of display in main method. (in notebook point scope )--------  static method or static variable sttaic mei he chalega*/

//     public static void main(String[] args) {
//         display(); // not static method can't run

//     }
// }
    
// -------soo correct way is -----

/*class Instance2 {
    int num = 10; // Instance variable

    void display() { // Non-static method
        System.out.print(num);
    }

    public static void main(String[] args) {
        Instance2 obj = new Instance2(); // Creating an object
        obj.display(); // Calling non-static method using the object
    }
}*/


// Have default values like int = 0 , float = 0.0 , double = 0.0, boolean = false , string(or objects) = null.

class Instance2{
    int num1;  // Instance variable

    String s;  // Instance variable
    
    public static void main(String[] args) {
        int  num2; //local variable


        Instance2 obj = new Instance2();
        System.out.println(obj.num1);
        System.out.println(obj.s);
       // System.out.println(obj.num2); // local variable does not have default values



}
}