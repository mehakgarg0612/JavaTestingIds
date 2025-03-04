
import java.util.*;

public class SumOfSquaresOfFirst_N_NaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number");

         try{
            int user = input.nextInt();
            if(user < 0){
                System.out.println("You have enter invalid input");
                return;}

        
        int sum = 0; 
        int multiply = 1;

for(int number = 1 ; number <= user ; number ++){
    multiply = number * number;
    sum = sum + multiply;
}
        System.out.println("Total Sum of  squares of all number :" + sum);
        }
        catch(Exception e){
            System.out.println("You have enter invalid input");
        }


    }
}
    