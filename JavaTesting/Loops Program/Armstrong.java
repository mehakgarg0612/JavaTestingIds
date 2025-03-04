
// import java.util.Scanner;
// import java.util.*;


/*public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer number");
        int user = input.nextInt();

        int number = user;

        int sum = 0;
        int remainder;

        while(number >= 0){
            remainder = number % 10;
            sum = sum + (remainder*remainder*remainder);
            number = number / 10;

        }
        System.out.println("The armstrong number: "+ sum);

        if(user==sum){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
        
}

}*/

     /*   System.out.println("Enter an integer number:");

        try {
            int user = input.nextInt();
            if (user < 0) {
                System.out.println("Number is not Armstrong (Negative numbers cannot be Arsmtrong).");
                return;
            }
            for(int number = 1 ; number <= user ; number++){
            int temporary_no = number;
            int remainder;
            int sum = 0;
            int digitCount = String.valueOf(number).length();


            while (temporary_no >0 ) {
                remainder = temporary_no % 10;
               sum = sum +  (int)Math.pow(remainder, digitCount);
              
                temporary_no = temporary_no / 10;
            }
             
            if (number == sum) {
                System.out.print(sum + " ");
        
        }
        } 
    }
    
            catch (Exception e) {
                System.out.println("you have enter an invlaid input");
        }
    }
 }*/


