import java.util.Scanner;

public class EmployeeManagementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee1 = new Employee();

        employee1.employeeID = 12;
        employee1.name = "Qedim";
        employee1.position = "HR";
        employee1.salary = 600;


        System.out.println();
        employee1.displayEmpoleeInfo(employee1.employeeID, employee1.name, employee1.position, employee1.salary);
        System.out.println("Enter percentage: ");
        int per = sc.nextInt();
        double newSalary = employee1.increaseSalary(per);
        System.out.println("New salary: " + newSalary);




    }
}
