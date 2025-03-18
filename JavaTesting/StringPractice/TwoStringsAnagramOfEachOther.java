package StringPractice;

import java.util.Arrays;

public class TwoStringsAnagramOfEachOther {
    public static void main(String[] args) {
        String name = "tweet";
        String name2 = "weett%%t";

       char[] ch = name.toCharArray();
       char[] ch2 = name2.toCharArray();

       Arrays.sort(ch);
       Arrays.sort(ch2);

       if(Arrays.equals(ch,ch2)){
           System.out.println("anagrams");
       }
       else{
           System.out.println("No anagrams");
       }

    }
}
