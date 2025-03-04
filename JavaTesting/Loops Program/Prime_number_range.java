import java.util.Scanner;

public class Prime_number_range{
      public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter Positive integer number");
//int user = input.nextInt();



for(int user = 1; user <= 10 ; user++){  1
      int temporary_no = 0;
 
      for(int number = 2; number <= user-1 ; number++){  2 < 0
            if(user % number == 0){
                  temporary_no = temporary_no + 1;
            }
      
     
}

if(temporary_no == 0){
      System.out.println("Number is a prime number"+ user);
}
      // else{
      // System.out.println("Number is a prime number");
      // }
}
      }
}

