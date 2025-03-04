import java.util.Scanner;

public class Fibonacci_series_Upto_N{
    
 //write a program for febonaci seires upt to Nth number   
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an postive integer number:");


    try{
      int user = input.nextInt();
      if(user <= 0){
        System.out.println("You have enter invalid number");
        //return;
      }
      int number1 = 0; //0
      int number2 = 1; //1
      System.out.println(number1);  //0
      System.out.println(number2);   //1
      for(int number = 1 ; number <= user ; number++)  //1 ;67;2
      { int number3 = number1 + number2;   //1=0+1
        System.out.println(number3);  //1
        number1 = number2;   //1
        number2 = number3; //1
      }
    }
    catch(Exception e){
        System.out.println("You have enter invlaid input");
    }
}
}

