// public class OddEven {
//         public static void main(String[] args) {
//             int num = 2;
//             if (num % 2 == 0) {
//                 System.out.println("Even");
//             } else {
//                 System.out.println("Odd");
//             }

//         }
//     }


// If I want to take input from system.

import java.util.Scanner; // import the Scanner class from java.util package:

// public class OddEven{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in); //create scaneer obj

//         System.out.print("Enter your name");
//         String name = sc.nextLine(); // string input

//         System.out.print("Enter your age");
//         int age = sc.nextInt(); //integer input

//         System.out.print("Enter your height");
//         double height = sc.nextDouble();

//         System.out.print("hello " + name +"your age is: " + age + "and your height is: " + height);

//         sc.close();

    


//     }
// }

public class OddEven{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.print("Even");
        }
        else{
            System.out.print("odd"); 
        }
    }
}