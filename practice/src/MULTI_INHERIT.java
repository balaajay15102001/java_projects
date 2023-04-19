import java.util.Scanner;

public class MULTI_INHERIT {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.emp_det();
        obj.emp_sal();
    }
}
//implement 2 interfaces it is the Multiple inheritance..
interface emp_name{
    void emp_det();
}
interface emp_salary{
    void emp_sal();
}
class Employee implements emp_name,emp_salary{
    static Scanner input = new Scanner(System.in);
    @Override
    public void emp_det() {
        System.out.print("Emp Name: ");
        String Name = input.next();
        System.out.println("Hi "+Name);

    }
    public void emp_sal(){
        System.out.println("your salary=100000");
    }
}
