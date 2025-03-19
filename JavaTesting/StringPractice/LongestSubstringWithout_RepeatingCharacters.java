package StringPractice;

//In "abcabcbb", the longest substring without repeating characters is "abc" — its length is 3.

public class LongestSubstringWithout_RepeatingCharacters {
    public static void main(String[] args) {

        String name = "pwwkew";
        String name2 = "";

        for(int i = 0 ; i < name.length() ;  i++){
            if(name2.indexOf(name.charAt(i)) == -1){
                name2 += name.charAt(i);
            }
        }
        System.out.println(name2);

    }
}
