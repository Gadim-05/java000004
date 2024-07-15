package Jujutsu_Kaisen;

public class Curse extends Character{

    private String speed;

    public Curse(String name, String curseTechnique, String tierRank, String domainExpansion, String speed) {
        super(name, curseTechnique, tierRank, domainExpansion);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

//    @Override
//    public void openDomain(String name) {
//        super.openDomain(name);
//    }
//
//    @Override
//    public void useCurseTechnique(String name) {
//        super.useCurseTechnique(name);
//
//    }

    @Override
    public void characterInfo() {
        super.characterInfo();
        System.out.println("Speed: " + speed);
    }
}
