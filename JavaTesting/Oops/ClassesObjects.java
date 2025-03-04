// public class ClassesObjects {

//      int number = 5;
//      static int number1 = 9;

//     public static void main(String[] args) {
//         ClassesObjects obj = new ClassesObjects();
//         System.out.println(obj.number);
//         System.out.println(obj.number);

//         System.out.println(ClassesObjects.number1); // runnable
//         System.out.println(number1); //runnable
//         System.out.println(obj.number1); //runnable
        
        
//     }
// }


//Multiple classes

// class Number{ // instance method
//   //int num = 5;
//   int num; //modified object
//   final int num1 = 9;
// }
//  class ClassesObjects{
//   public static void main(String[] args) {

//    Number obj = new Number();
//     obj.num = 8;
//     //obj.num1 = 10;   //cant change variable because we have used the final keyword
//     System.out.println(obj.num);
//     System.out.println(obj.num1); // cant print
    
    
//   }
// }


//Multiple Objetcs

class Number{
  int number = 9;
}

public class ClassesObjects{
  public static void main(String[] args) {

    Number object = new Number();
    Number object2 = new Number();

    object2.number = 10;
    System.out.println(object.number);
    System.out.println(object2.number);
    
  }
}