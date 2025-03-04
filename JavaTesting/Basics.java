
// class Basics{
//     static num;
//     public static void main(String[] args){
//     // byte num;
//     if(num == 2){
//         System.out.println("True");
//     }
//     else{
//         System.out.println(false);
//     }
    
// }
// }


// class Basics {
//     static int y; // Stored in Method Area
//     int x = 10;

//     public static void main(String[] args) {
//         System.out.println(y);
//         System.out.println(x);
//     }
// }



//Problem
// class Basics {
//     static int y; // Stored in Method Area
//     static int x = 10;
//     static int x2 = 15;

//     void add(){
//       int c1 = x + x2;

//     }

//     public static void main(String[] args) {
//         System.out.println(c1);
//         System.out.println(x);//won't give error bcoz x is static
//         // System.out.println(x);
//     }
// }

//Solution

// class Basics {
//     static int x = 100;
//     static int y = 20;
//     int x1 = 500;
//     int y2 = 20;

//     void add(){
//         int c = x+y;
//         // int d = x1 + y2;
//         System.out.println(c);
//         // System.out.println(d);

//     }

//     void sub(){
//         int c = x-y;
//         System.out.println(c);
//         add();
//     }

//     public static void main(String[] args){
//         System.out.println(x);
//         System.out.println(y);

//         Basics obj = new Basics();
//         obj.sub();
//     }

// }

//type casting

/*class Basics {
    public static void main(String[] args){
        int num = 9;
        double num2 = num;

        System.out.println(num);
        System.out.println(num2);

    }
}*/

// class Basics {
//     public static void main(String[] args) {
//         double num = 9.6d;
//         int num2 = (int)num;

//         System.out.println(num);
//         System.out.println(num2);

//     }
// }

class Basics {
    public static void main(String[] args) {
        // short num = 67;
        // char num2 = (char) num;

        char num = 1200;
        short num2 = (short)num;

        System.out.println(num);
        System.out.println(num2);

    }


    // --------------------------can we overload main---------important------------


    class MainOverload {
        // Standard main method (called by JVM)
        public static void main(String[] args) {
            System.out.println("Main method with String[] args");

            // Calling overloaded main methods manually
            main(10);
            main("Hello");
        }

        // Overloaded main method with an int parameter
        public static void main(int num) {
            System.out.println("Main method with int: " + num);
        }

        // Overloaded main method with a String parameter
        public static void main(String str) {
            System.out.println("Main method with String: " + str);
        }
    }

}