package StringPractice;

public class ReverseAString {
    public static void main(String[] args) {

        String name = "komal";
        String reverse = "";
        for(int start = name.length()-1 ; start >= 0 ; start--){
            reverse += name.charAt(start);
        }
        System.out.println(reverse);
    }
}
