public class ZooMain {
    public static void main(String[] args) {
        Mammal wolf = new Mammal("Alex",7,"Auuuuu","grey");
        Bird flamingo = new Bird("Gulmali",4,"Qixqixqix","1.5 meter");
        Aquatic shark = new Aquatic("Teymur", 8, "Roooor", "2.5 km");


        wolf.giveBirth();
        wolf.details();
        System.out.println();
        flamingo.fly();
        flamingo.details();
        System.out.println();
        shark.swim();
        shark.details();

    }
}
