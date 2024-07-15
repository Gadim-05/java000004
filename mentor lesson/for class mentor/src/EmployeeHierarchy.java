public class EmployeeHierarchy {
   private String name;
   private int salary;

    public EmployeeHierarchy(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeHierarchy() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void getDetails(){
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }
}
