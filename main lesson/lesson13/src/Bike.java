public class Bike extends Vehicle{
    int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }


    @Override
    void details() {
        super.details();
        System.out.println("Wheels count: " + numWheels);
    }
}
