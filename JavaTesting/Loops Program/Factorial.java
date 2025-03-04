// import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter an postive integer number:");

//         if (!input.hasNextInt()) {
//             System.out.println("You have enter invalid input. Please enter integer.");
//             return;

//         }
//         int user = input.nextInt();
//         if (user < 0) {
//             System.out.println("You have enter negative number");
//             return;
//         }

       
//         int multiply = 1;
//         for(int number = 1 ; number <= user ; number++){
//             multiply = multiply * number;
//         }
//         System.out.println("Factorial of a number : "+ multiply);
// }
// }


//------------through Try-catch-------------------------

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an postive integer number:");

    try{
        int user = input.nextInt();
        if (user < 0) {
            System.out.println("You have enter negative number");
            return;
        }
<<<<<<< HEAD
        System.out.println("Factorial of a number : "+ multiply);
    }
}
=======
        if (user > 20) {
            System.out.println("Error: Factorial value is too large to be stored in 'long'. Please enter a number ≤ 20.");
            return;
        }
       
        long factorial = 1;
        for(int number = 1 ; number <= user ; number++){
           factorial = factorial * number;
        }
        System.out.println("Factorial of a number : "+ factorial);
 }

 catch(Exception  e){
     System.out.println("You have enter invalid input. Please enter integer.");
 }
    }
}
>>>>>>> 2d7ac3d063a48823d2fdf817d666dfd35a14415c
