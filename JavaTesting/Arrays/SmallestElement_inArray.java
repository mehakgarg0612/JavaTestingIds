
public class SmallestElement_inArray {
    public static void main(String[] args) {
        int[] element = {2,23,4,5,1};

        int result = element[0];
        

        for(int numbers = 1 ; numbers < element.length ; numbers++){
            if(result > element[numbers]){
                result = element[numbers];

            }
        
      
    }
        System.out.println("Minimum elemnt in array is : " + result);
    }
}


import java.util.Scanner;

//public class IDArrayInput {
  //  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of IDs
        System.out.print("Enter the number of IDs: ");
        int size = scanner.nextInt();

        // Declare an array to store IDs
        int[] ids = new int[size];

        // Take input for each ID
        System.out.println("Enter " + size + " IDs:");
        for (int i = 0; i < size; i++) {
            System.out.print("ID " + (i + 1) + ": ");
            ids[i] = scanner.nextInt();
        }

        // Display the entered IDs
        System.out.println("\nYou entered the following IDs:");
        for (int id : ids) {
            System.out.println(id);
        }

        scanner.close(); // Close the scanner
    }
}
