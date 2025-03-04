import java.util.*;
public class CheckIfAnArrayIs_SortedInAscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size; 

        System.out.println("Enter the number of elements :");

        size = input.nextInt();

        System.out.println("Enter " + size + " elements : ");

        while(size <= 0){
            System.out.println("Error: please enter the number greater than zero");
            System.out.println("Please enter the number again");
            size = input.nextInt();
        }

        int[] numbers = new int[size];//{12,3,4,5}

        for(int user = 0 ; user < size ; user++){
            numbers[user] = input.nextInt();
        }

        int target = numbers[0]; //12

        for(int start = 1 ; start < numbers.length ; start++)
        {
            if(numbers[start] > numbers[start - 1]){ //{ 3 > 12
                System.out.println("Array is not in ascending order");
                return;

            }
          
        }
        System.out.println("Array is in ascending order");
    }
}


/* int count = 0; // Count how many elements are out of order

for(
int start = 1;start<numbers.length;start++)
{
            if (numbers[start] < numbers[start - 1]) {
                count++; // Count incorrect order
            }
        }

  If count is 0, array is sorted, otherwise it's not
if(count==0)
{
    System.out.println("Array is in ascending order");
}else
{
            System.out.println("Array is not in ascending order");
        } */