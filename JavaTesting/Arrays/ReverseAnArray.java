public class ReverseAnArray {
    public static void main(String[] args) {
        int[] numbers = {-12,3,4};
        // for(int reverse = numbers.length ; reverse >= 0 ; reverse--){ numbers.length = 3, so the loop starts at i = 3.
 //     But there is no numbers[3], so Java throws ArrayIndexOutOfBoundsException.

            for (int reverse = numbers.length - 1; reverse >= 0; reverse--){ // Now it works because the last index is length - 1.
            System.out.print(numbers[reverse] + " ");
        }
    }
}


// for(int reverse = numbers.length ; reverse >= 0 ; reverse--)
//{ numbers.length = 3, so the loop starts at i = 3.
// But there is no numbers[3], so Java throws ArrayIndexOutOfBoundsException.