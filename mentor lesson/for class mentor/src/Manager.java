public class Manager extends EmployeeHierarchy {
    int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Team size: " + teamSize);
    }
}
