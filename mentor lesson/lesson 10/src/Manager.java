public class Manager extends Employee{
    private int teamSize;


    public Manager(String name, double salary, double bonus, int teamSize) {
        super(name, salary, bonus);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

//    @Override
//    public double calculateBonus() {
//        return super.calculateBonus();
//    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team size: " + teamSize);
    }
}
