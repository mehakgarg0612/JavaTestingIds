package ArrayPractice;

public class SecondSmallestElement_InArray {
    public static void main(String[] args) {

        int[] numbers = {12,3,4,56,34};

        int temp;

        for(int row = 0 ; row < numbers.length ;row++){
            for(int column = row + 1 ; column < numbers.length ;column++){

                if(numbers[row] > numbers[column]){

                    temp = numbers[row];
                    numbers[row] =numbers[column];
                    numbers[column] = temp;

                }
            }

            if(row == 1){
                break;
            }

        }
        for(int row = 0 ; row < numbers.length ;row++){
            System.out.println(numbers[row]);
        }
        System.out.println("Second smallest element in array is : " + numbers[1]);
    }
}
