public class Bird implements Animal,Flyable{
    @Override
    public void fly() {
        System.out.println("Sahin uctu");
    }

    @Override
    public void takeOff() {
        System.out.println("Uctu");
    }

    @Override
    public void land() {
        System.out.println("Sahin indi");
    }

    @Override
    public void getName() {
        System.out.println("Teymur");
    }

    @Override
    public void makeSound() {
        System.out.println("cik cik");
    }
}

