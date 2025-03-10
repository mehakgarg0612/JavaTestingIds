package Github_questions.EasyQuestions;

import java.util.Scanner;

public class IfNumberIsPrime {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter positive integer");

        if(user.hasNext()){
            int number = user.nextInt();
            for(int start = 2 ; start <= number - 1 ; start++){ //
                if(number % start == 0){
                    System.out.println("Number is not prime");
                }
            }

                System.out.println("Number is prime");
        }
        else{
            System.out.println("invalid credenatials");
        }
    }
}
