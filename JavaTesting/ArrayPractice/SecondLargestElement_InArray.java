package ArrayPractice;

public class SecondLargestElement_InArray {
    public static void main(String[] args) {

        int[] numbers = {12,3,4,56,34};

        int temp;

        for(int row = 0 ; row < numbers.length ;row++){
            for(int column = row + 1 ; column < numbers.length ;column++){

                if(numbers[row] < numbers[column]){

                    temp = numbers[row];
                    numbers[row] =numbers[column];
                    numbers[column] = temp;

                }
            }

        }
        System.out.println(numbers[1]);
    }
}
