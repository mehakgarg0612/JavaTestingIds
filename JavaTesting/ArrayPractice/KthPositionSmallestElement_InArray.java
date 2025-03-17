package ArrayPractice;

public class KthPositionSmallestElement_InArray {
    public static void main(String[] args) {

        int[] numbers = {12,3,4,56,34};

        int temp;
        int k = 4;

        for(int row = 0 ; row < numbers.length ;row++){
            for(int column = row + 1 ; column < numbers.length ;column++){

                if(numbers[row] > numbers[column]){

                    temp = numbers[row];
                    numbers[row] =numbers[column];
                    numbers[column] = temp;

                }
            }

            if(row == k - 1){
                System.out.println(k + "smallest element " + numbers[row]);
                break;
            }

        }
//        System.out.println("Second smallest element in array is : " + numbers[1]);
        }

    }

