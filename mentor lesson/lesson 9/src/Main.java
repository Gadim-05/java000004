//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VirtualPet pet1 = new VirtualPet("Teymur",50,50);
        pet1.feed(pet1.getName());
        pet1.play(pet1.getName());
        pet1.printStats(pet1.getName());
    }
}