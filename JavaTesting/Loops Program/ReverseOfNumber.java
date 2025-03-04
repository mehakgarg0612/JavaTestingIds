// import java.util.Scanner;

// public class ReverseOfNumber {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter an integer number:");
//         int user = input.nextInt();

//         int number = user;
//         int remainder;
//         int reverse = 0;

//       while (number > 0){
//         remainder = number % 10;
//         reverse = reverse * 10 + remainder;
//         number = number / 10;
//       }
//       System.out.println("Reverse of a number is: "+ reverse);
// }



import java.util.Scanner;

public class ReverseOfNumber {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");

    try{
      int user = input.nextInt();
      int IsNegative = (user < 0) ? -1 : 1;
      int number = Math.abs(user);
      
      

        // if(user < 0){
        //   System.out.println("you have enter negavtive number");
        //   return;  
        // }

        int remainder;
        int reverse = 0;

for (; number > 0 ; number/=10){
      remainder = number % 10;
      reverse = reverse * 10 + remainder;
}
System.out.println(reverse * IsNegative);
    }

    catch(Exception e){
      System.out.println("You have enter invalid input");
    }
  }
}
