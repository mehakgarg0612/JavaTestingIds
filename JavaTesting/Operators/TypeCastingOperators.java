public class TypeCastingOperators {
    public static void main(String[] args)
    {
//Automatic_casting();
//manual_casting();
//Char_TO_ASCII();
//ASCII_TO_Char();
//add_int_to_float();
//add_float_to_int();
// boolean_to_string();  // -------important-----
string_to_boolean(); // -------important-----

    }


public static void Automatic_casting(){
        byte num = 9;
        int num2 = num;
        System.out.println(num2);
}

public static void manual_casting(){
    double num = 98.767D;
    float num2 = (float) num;
    System.out.println(num2);
}


public static void Char_TO_ASCII(){
    char num1 = 'a';
    int num2 = (int)num1;
    System.out.println(num2);
}

public static void ASCII_TO_Char(){
    int num = 65;
    char num2 = (char)num;
    System.out.println(num2);
}

public static void add_int_to_float(){
    int num = 3;
    float num2 = 9.8f;
    System.out.print(num + num2);
}

public static void add_float_to_int(){
    float num = 9.8f;
    int num2 = (int) num; 
    System.out.println(num2);
}


public static void boolean_to_string(){
    boolean num = true;
   // String num2 = String(num);  //directly we cna't do
   String num2 = String.valueOf(num);
   System.out.println(num2);

}

public static void string_to_boolean() {
    String str = "true";
    boolean num = Boolean.parseBoolean(str); // Correct way
    System.out.println(num); // Output: true
}












}