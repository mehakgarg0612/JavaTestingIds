import java.util.Scanner;

public class Prime_number_1ToN {
      public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter Positive number");

try{
int user = input.nextInt();
if(user <=1){
      System.out.println(user + " is not a prime number");
      return;
}

for(int number = 2; number <= user ; number++){
      int temporary_no = 0;
      for(int number2 = 2 ; number2 <= number -1 ; number2++ ){
             if(number% number2 == 0){
                  temporary_no = temporary_no + 1;
             }
      }
      if(temporary_no == 0){
            System.out.println(number+  "  is a prime number ");
      }
    
}


}
catch(Exception e){
      System.out.println("you have enter invalid input");
}
}
}

