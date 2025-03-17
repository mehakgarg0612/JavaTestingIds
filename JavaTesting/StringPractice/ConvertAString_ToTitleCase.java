package StringPractice;

public class ConvertAString_ToTitleCase {
    public static void main(String[] args) {
        String word = "hello string";

        word = word.trim();
        String result="";
        for (String i : word.split(" ")) {
            if (!i.isEmpty()) {
               result += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
            }
            System.out.println(result);
        }
        System.out.println(result);
    }
}
