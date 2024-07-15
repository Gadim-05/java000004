public class Plane implements Transport,Flyable{

    @Override
    public int getCapacity() {
        return 100;
    }

    @Override
    public void getDestination() {
        System.out.println("Goytepe Terter");
    }

    @Override
    public void fly() {
        System.out.println("Ag teyyare men ucmusam");
    }

    @Override
    public void takeOff() {
        System.out.println("Done bilmirem done bilmirem");
    }

    @Override
    public void land() {
        System.out.println("Men durnalarla kocmusam");
    }
}
