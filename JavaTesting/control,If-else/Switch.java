
import java.awt.im.InputContext;

public class Switch {
    public static void main(String[] args){
        Weekend();
    }



/*public static void Weekend(){
    int day = 5;
    switch(day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("tuesday");
            break;
        
        case 3:
            System.out.println("wednesday");
            break;
        case 4:
            System.out.println("thursday");
            break;
        case 5:
            System.out.println("friday");
            break;
        case 6:
            System.out.println("saturday");
            break;
        
        case 7:
            System.out.println("sunday");
            break;
    };
}*/



public static void Weekend(){
    String day = "sunday";
    switch(day){
        case "monday":
            System.out.println("Monday");
            break;
        case "tuesday":
            System.out.println("tuesday");
            break;
        
        case "wednesday":
            System.out.println("wednesday");
            break;
        case "thursday":
            System.out.println("thursday");
            break;
        case "friday":
            System.out.println("friday");
            break;
        case "saturday":
            System.out.println("saturday");
            break;
        
        case "sunday":
            System.out.println("it's a sunday");
            break;
        }
    }
}