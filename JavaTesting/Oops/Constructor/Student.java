package Constructor;

public class Student{
    String name;
    int marks ;
    

    Student(String STudent1_name , int STudent_marks){
        name = STudent1_name;
        marks = STudent_marks;
    }


    public static void main(String[] args) {
        Student my_Student = new Student("kunal" ,80);
        System.out.println(my_Student.name);
        // my_Student.name = "kunal";
        //  my_Student.marks = 90;
        // System.out.println(my_Student.name);
        // System.out.println(my_Student.marks);
    }
}