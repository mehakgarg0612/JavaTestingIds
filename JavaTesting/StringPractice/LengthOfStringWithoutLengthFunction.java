package StringPractice;

public class LengthOfStringWithoutLengthFunction {
    public static void main(String[] args) {

        String name = "polika";
        int count = 0;

        // by for-each loop
        for(char ch : name.toCharArray()){
            count += 1;
        }
        System.out.println(count);


        // by for loop
        for(int i = 0 ; i > 0 ; i++){
            name.charAt(i);
            count++;
        }
        System.out.println(count);


    }
}
