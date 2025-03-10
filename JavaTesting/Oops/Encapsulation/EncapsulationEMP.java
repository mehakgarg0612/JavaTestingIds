package Oops.Encapsulation;
class Employee{
    private int emp_id;

    public void setEmp_id(int id){
        emp_id = id;

    }

    public int getEmp_id(){
        return emp_id;
    }
}

public class EncapsulationEMP {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setEmp_id(100);
        System.out.println(obj.getEmp_id());
    }
}
