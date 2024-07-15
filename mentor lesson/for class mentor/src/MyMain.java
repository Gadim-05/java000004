public class MyMain {
    public static void main(String[] args) {
        EmployeeHierarchy employee1 = new EmployeeHierarchy("Taceddin", 1200);
        Manager manager1 = new Manager("Gulmemmed", 1300, 10);
        Developer developer1 = new Developer("Xanlarogu", 2400, "Java");

        employee1.getDetails();
        manager1.getDetails();
        developer1.getDetails();
    }
}
