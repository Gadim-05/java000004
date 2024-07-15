public class Developer extends EmployeeHierarchy{
    String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Programming language: " + programmingLanguage);
    }

}
