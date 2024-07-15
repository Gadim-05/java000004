import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    int employeeID;
    String name;

    String position;

    double salary;

    public void displayEmpoleeInfo(int employeeID, String name, String position, double salary){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Position: " + position);
        System.out.println("Employee's Salary: " + salary);
    }

    public double increaseSalary(int per){



        return salary + ((salary*per)/100);
    }



}
