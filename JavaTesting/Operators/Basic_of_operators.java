//One method of doing

/*class Basic_of_operators {
    public static void main(String[] args) {
        check_divisibility(); 
    }

    public static void check_divisibility() { 
        int num = 6;

        if (!(num % 2 == 0 && num % 3 == 0)) { 
            System.out.println("Not divisible");
        } else {
            System.out.println("Divisible");
        }
    }
}*/

// Another method of doing

// class Basic_of_operators {
//     public void checkDivisibility() {  
//         /*This is instance method that's why we have make object here. if I make public static
//         void checkDivisibility() so this will be a static method .I can directly call it without making the object.*/
//         int num = 6;
//         if (!(num % 2 == 0 && num % 3 == 0)) {
//             System.out.println("Not divisible");
//         } else {
//             System.out.println("Divisible");
//         }
//     }

//     public static void main(String[] args) {
//         Basic_of_operators obj = new Basic_of_operators();

//         obj.checkDivisibility(); 
//     }
// }

// Third way

public class Basic_of_operators {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
    }
}


















