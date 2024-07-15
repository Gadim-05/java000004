public class Director extends Manager {

    private int stockOptions;

    public Director(String name, double salary, double bonus, int teamSize, int stockOptions) {
        super(name, salary, bonus, teamSize);
        this.stockOptions = stockOptions;
    }

    public int getStockOptions() {
        return stockOptions;
    }

    public void setStockOptions(int stockOptions) {
        this.stockOptions = stockOptions;
    }

//    @Override
//    public double calculateBonus() {
//        return super.calculateBonus();
//    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Stock Options: " + stockOptions);
    }
}
