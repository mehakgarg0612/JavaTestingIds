import java.util.*;
public class Even_numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter integer number");
        int user = input.nextInt();
        for(int number = 1; number <= user; number++){
            if(number%2 == 0){
                System.out.println("All even number: "+ number);
            }
        }
    }
}