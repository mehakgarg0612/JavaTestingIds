import java.util.*;
/*public class CountOccurencesOfGivenElement {
    public static void main(String[] args) {
        
        int[] numbers = {12,12,4,4,12,6,12};
        int target = 12;

        int count = 0;
        for(int start = 0 ; start <numbers.length ;  start++){
            if (numbers[start] == target){
                count = count + 1;
            }


        }
        System.out.println("The number of count of 12 in given array is : " + count);




    }
} */

public class CountOccurencesOfGivenElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.println("Enter the number of elements");
        size = input.nextInt();

        while(size <=0 ){

            System.out.println("Error :  please enter number which is greater than 0");
            System.out.println("Plaese enter again");
            size = input.nextInt();
        }

        int[] number = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int user=0 ; user < size ; user++){
            number[user] = input.nextInt();

        }
        System.out.println("Enter the number you want to count in the array : ");
        int count = 0;
        int target = input.nextInt();

        for(int start = 0 ; start < number.length ; start++)
        {
            if(number[start] == target )
            count = count + 1;

        }
        System.out.println("The count of " + target + " in array is : " + count);



        




    }
}