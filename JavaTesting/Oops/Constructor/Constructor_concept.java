package Oops.Constructor;
   // public class Constructor_concept{

//     int x ;

//     public Constructor_concept(){
//         x = 5;
//     }
    
//     public static void main(String[] args) {
//         Constructor_concept myObject = new Constructor_concept();
//         System.out.println(myObject.x);
        
        
//     }
// }

//why we use constructor


// public class Constructor_concept {

//     int x ;

//     public Constructor_concept(int value){
//                 x = value;
            
//         }

//     public static void main(String[] args) {

//         Constructor_concept myObject = new Constructor_concept(10);
//         Constructor_concept myObject2 = new Constructor_concept(20);
//         System.out.println(myObject.x);
//         System.out.println(myObject2.x);

        
//     }
// }

public class Constructor_concept {
    int Model_year;
    String Brand_name;

    public Constructor_concept(int year , String name){
       Model_year = year;
        Brand_name = name;
    }
    public static void main(String[] args) {

        Constructor_concept myObject = new Constructor_concept(2019, "Mustang");
        System.out.println(myObject.Model_year + " " + myObject.Brand_name);


        
    }
}


