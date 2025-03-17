package ArrayPractice;

public class MinimumNumber_inArray {
    public static void main(String[] args) {

        int[] number = {23,4,2,1};
        int minimum = number[0];
        for(int start = 1; start < number.length ; start++){
                if (minimum > number[start]){
                    minimum = number[start];

                }
        }
        System.out.println("Minimu number in array is : " + minimum);
    }
}
