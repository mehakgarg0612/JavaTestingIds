package StringPractice;

import java.util.*;
public class STringssss20 {
    public static void main(String[] args) {
        String name = "madam";
        String name2 ="";

       for(int i = 0 ; i < name.length() ; i ++){
           if(name.indexOf(i) == name.lastIndexOf(i)){
              name2 += name.charAt(i);
              break;

           }
       }
        System.out.println(name2);
    }
}



