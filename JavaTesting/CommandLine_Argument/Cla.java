

// public class Cla {
//     public static void main(String[] args) {
//         System.out.println(args[0]);
//     }
// }

public class Cla {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        
        // Loop through arguments and print each one
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
//java CommandLineExample Hello World 123
