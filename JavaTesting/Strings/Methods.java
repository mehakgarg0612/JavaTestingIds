import java.util.*;

public class Methods {
    public static void main(String[] args){
    // String x = "10";        implicit casting
        // int y  = 10;
        // String z = x+ y;
        
        // System.out.println(z);
        
       /*  String x = "10"; // explicit casting
        int y  = 10;
        int z = Integer.parseInt(x)+ y;
        
        System.out.println(z);*/

        

        String Name = "Hello world , Hello Java ";
        String String2Name = "Pookie";
        String String3Name = "   Pookie2  ";

       // System.out.println(Name.length());
       // System.out.println(Name.indexOf("Hello"));
       // System.out.println(Name.toUpperCase());
       // System.out.println(Name.toLowerCase());
       //System.out.println(Name.concat(String2Name));
       //System.out.println(Name.charAt(0));
       //System.out.println(Name.valueOf('e'));  xxxx
      // System.out.println(Name.substring(2,8));
      // System.out.println(Name.compareTo(String2Name));
       //System.out.println(String2Name.contains("po"));
       // System.out.println(Name.endsWith("ava "));
       //System.out.print(String3Name.trim());    

       /*char[] str_1 = {'a','b','c','d'} ;
       String s2 = " ";
        s2 = s2.copyValueOf(str_1, 0 , 3);
       System.out.println(s2);
       System.out.println(str_1);*/

      /*String Name_string1 = "Hello";
      String Name_string2 = "Helllo";

      System.out.println(Name_string1.equals(Name_string2));

     int Name_string1 = 12;
      int Name_string2 = 13;

      System.out.println(Name_string1.equals(Name_string2));

      String s1 = new String("Hello");
    String s2 = new String("Hello");


    System.out.println(s1 == s2); // false (Different objects in heap)*/

    Scanner input = new Scanner(System.in);
    System.out.println("enter string");
    String name = input.nextLine();
    System.out.println(name);





    }
}
