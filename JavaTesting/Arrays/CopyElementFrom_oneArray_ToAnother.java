import java.util.Scanner;

/* public class CopyElementFrom_oneArray_ToAnother {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int[] numbers = {2,3,4,5};
        int[] copy = new int[numbers.length];
        for(int start = 0 ; start < numbers.length ; start++){
            copy[start] = numbers[start];
            System.out.print(copy[start] + " ");
        }
    }
} */


/*  public class CopyElementFrom_oneArray_ToAnother {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter" + size + "elments");
        for(int user = 0 ; user < size ; user++){
           numbers[user] = input.nextInt();
        }

        int[] copy = new int[numbers.length];
        for(int start = 0 ;start < numbers.length ; start++){
            copy[start] = numbers[start];
            System.out.print(copy[start] + " ");
        }

    }
} */


public class CopyElementFrom_oneArray_ToAnother {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int size;
System.out.println("Enter the number of elements");
 size = input.nextInt();

while(size <= 0){
    System.out.println("Error : Size must be positive number greater than zero ");
    System.out.println("Please enter again");
    size = input.nextInt();
    
}

int[] numbers = new int[size];

System.out.println("Enter" + size + "elments");
for(int user = 0 ; user < size ; user++){
numbers[user] = input.nextInt();
}

int[] copy = new int[numbers.length];
for(int start = 0 ;start < numbers.length ; start++){
copy[start] = numbers[start];
System.out.print(copy[start] + " ");
}

}
}
