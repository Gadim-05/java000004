public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinessLevel;


    public VirtualPet(String name, int hungerLevel, int happinessLevel) {
        this.name = name;
        this.energyLevel = hungerLevel;
        this.happinessLevel = happinessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungerLevel() {
        return energyLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.energyLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }


     void feed(String name){
         System.out.println(name + " yemlenir");
        System.out.println("Happiness Level: " + (happinessLevel -= 5));
        System.out.println("Energy Level: " + (energyLevel += 10));

    }
     void play(String name){
         System.out.println(name + " oynayir");
        System.out.println("Happiness Level: " + (happinessLevel+=10));
        System.out.println("Energy Level: " + (energyLevel-=5));
    }

     void printStats(String name){
        System.out.println("Pet name: " + name);
        System.out.println("Pet energy: " + energyLevel);
        System.out.println("Pet happiness: " + happinessLevel);
    }
}
