package Oops.Constructor;

public class Student{
    String name;
    int marks ; // by default it will take value 0.
    

    Student(String STudent1_name , int STudent_marks){
        name = STudent1_name;
        marks = STudent_marks;
         marks = 90; // now this 
    }

    


    public static void main(String[] args) {
        Student my_Student = new Student("kunal" ,80);

        my_Student.name = "kunal";
         my_Student.marks = 90; // it will first see in heap memory where object is allocated
        System.out.println(my_Student.name);
        System.out.println(my_Student.marks);
    }
}