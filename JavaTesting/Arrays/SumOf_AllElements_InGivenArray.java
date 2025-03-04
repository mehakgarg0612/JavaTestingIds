// import java.util.Scanner;

// public class SumOf_AllElements_InGivenArray {
//     public static void main(String[] args) {
//         int[] arr_numbers = {12,3,4};

//         // Scanner input = new Scanner(System.in);
//         // System.out.println("Enter integers elemnts in array");
//         // int size = input.nextInt();

//         // int[] arr_numbers = new int[size];

//         int sum = 0;
//         for(int numbers = 0; numbers < arr_numbers.length ; numbers++){ 
//             sum = sum + arr_numbers[numbers];
//         }
//         System.out.println("Sum Of all elements in array is : " + sum);


//     }
    
// }


import java.util.Scanner;

public class SumOf_AllElements_InGivenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the number of elements (1000)
        int size = 3;
        int[] numbers = new int[size];

        // Taking input from the user
        System.out.println("Enter " + size + " numbers:");

        int sum = 0; // Variable to store sum

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt(); // User enters numbers
            sum += numbers[i]; // Add each number to sum
        }

        // Printing the sum of all 1000 numbers
        System.out.println("Sum of all " + size + " numbers is: " + sum);
 
    }
}


// Another approach
/*import java.util.Scanner;

public class SumOf_AllElements_InGivenArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Creating an array of given size
        int[] arr_numbers = new int[size];

        // Taking input for array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr_numbers[i] = scanner.nextInt();
        }

        // Calculating the sum of all elements
        int sum = 0;
        for (int num : arr_numbers) {
            sum += num;
        }

        // Displaying the sum
        System.out.println("Sum of all elements in the array is: " + sum);

        scanner.close(); // Closing the scanner
    }
}*/
