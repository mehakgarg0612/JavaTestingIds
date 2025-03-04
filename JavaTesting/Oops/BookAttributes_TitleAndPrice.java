class Book{

    String title = "Harry Potter";
    int price = 100;


    public void displayDetails(){
        System.out.println("Title of book is : " +title);
        System.out.println("price of book is :  " + price);
    }
}


public class BookAttributes_TitleAndPrice {
    public static void main(String[] args) {
        Book myObject = new Book();
        myObject.displayDetails();
    }
    
}
