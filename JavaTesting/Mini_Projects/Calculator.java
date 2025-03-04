import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter number : ");
    int num = input.nextInt();

     System.out.println("Enter an operator (+, -, *, /,%): ");
     String operator = input.next(); 


    System.out.println("Enter number2 : ");
    int num2 = input.nextInt();
    
    
    switch(operator){
        case "+":
         System.out.println(num + num2);
         break;

          case "-":
         System.out.println(num - num2);
         break;
        

          case "*":
         System.out.println(num * num2);
         break;
        

          case "/":
          if (num2 != 0){
         System.out.println(num / num2);}
         else{
            System.out.println("cannot divide byy zero");
         }
         break;
        
          case "%":
              if (num2 != 0) {
                  System.out.println(num % num2);
              } else {
                  System.out.println("cannot find remainder with zero");
              }
        break;
         default:
         System.out.print("You enter wrong opertor");
         break;
    }
}
}
