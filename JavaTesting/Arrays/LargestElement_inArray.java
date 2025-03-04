

public class LargestElement_inArray {
    public static void main(String[] args) {
        int[] element = {23,5,12,45};

        int result = 0;
        for(int numbers = 0 ; numbers<element.length ; numbers++){
            if(result < element[numbers]){
                result = element[numbers];
            }
            
        }
        System.out.println("Largest number in array is : " + result);
    }
}


import java.util.Scanner;

//public class SumOfLargeArray {
   // public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the number of elements (1000)
        int size = 1000;
        int[] numbers = new int[size];

        // Taking input from the user
        System.out.println("Enter " + size + " numbers:");

        int sum = 0; // Variable to store sum

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); // User enters numbers
            sum += numbers[i]; // Add each number to sum
        }

        // Printing the sum of all 1000 numbers
        System.out.println("Sum of all " + size + " numbers is: " + sum);

        scanner.close();
    }
}
