package ArrayPractice;

public class MaximumNumber_inArray {
    public static void main(String[] args) {

        int[] number = {12,3,4,23};
        int maximum = number[0];
        for(int start = 1 ; start<number.length ; start++){
            if(number[start] > maximum){
                maximum = number[start];
            }
        }

        System.out.println("Maximum number in array is : " + maximum);

    }
}
