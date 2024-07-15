package Jujutsu_Kaisen;

public class Sorcerer extends Character{

    private String clan;

    public Sorcerer(String name, String curseTechnique, String tierRank, String domainExpansion, String clan) {
        super(name, curseTechnique, tierRank, domainExpansion);
        this.clan = clan;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

//    @Override
//    public void openDomain(String name) {
//        super.openDomain(name);
//    }
//
//    @Override
//    public void useCurseTechnique(String name) {
//        super.useCurseTechnique(name);
//    }

    @Override
    public void characterInfo() {
        super.characterInfo();
        System.out.println("Clan: " + clan);
    }
}
