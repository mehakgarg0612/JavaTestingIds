import java.util.*;

public class SearchForElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int size; 

        System.out.println("Enter the number of elements ");

        int size = input.nextInt();

        while(size <= 0){
            System.out.println("Error : Please enter number which is greater than 0");
            System.out.println("Please enter number again");
            size = input.nextInt();
        }
        
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers : ");

        for(int user = 0 ; user < size ; user++){
            numbers[user] = input.nextInt();

        }
        System.out.println(" Enter the element you want to search : ");
        int target = input.nextInt();
        for(int start = 0 ; start< numbers.length ; start++){

            if(numbers[start] == target){
                System.out.println("your number found in the array at index " + start);
                return;
            }
        }
            System.out.println("Number is not in array");
    }
    
}
