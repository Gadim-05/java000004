public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateBonus(){
        return salary*bonus;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Salary after bonus: " + calculateBonus());
    }

}
