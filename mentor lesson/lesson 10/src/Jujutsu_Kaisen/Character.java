package Jujutsu_Kaisen;

import java.util.Scanner;

public class Character {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String curseTechnique;
    private String tierRank;
    private String domainExpansion;

    private int health;

    public Character() {
    }

    public Character(String name, String curseTechnique, String tierRank, String domainExpansion) {
        this.name = name;
        this.curseTechnique = curseTechnique;
        this.tierRank = tierRank;
        this.domainExpansion = domainExpansion;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurseTechnique() {
        return curseTechnique;
    }

    public void setCurseTechnique(String curseTechnique) {
        this.curseTechnique = curseTechnique;
    }

    public String getTierRank() {
        return tierRank;
    }

    public void setTierRank(String tierRank) {
        this.tierRank = tierRank;
    }

    public String getDomainExpansion() {
        return domainExpansion;
    }

    public void setDomainExpansion(String domainExpansion) {
        this.domainExpansion = domainExpansion;
    }

    public void openDomain(String name){
        if (domainExpansion.equals("none")){
            System.out.println(name + " can not open domain expansion");
        }
        else {


            System.out.println(name + " opened his domain: " + domainExpansion);
        }
    }
    public void useCurseTechnique(String name){
        System.out.println(name + " used his curse technique: " + curseTechnique);
    }

    public void characterInfo(){
        System.out.println("Name: " + name);
        System.out.println("Curse Technique: " + curseTechnique);
        System.out.println("Tier Rank: " + tierRank);
        System.out.println("Domain Expansion: " + domainExpansion);
    }


    public void characterChoosing(){
        System.out.println("1.Gojo \n" +
                "2.Sukuna \n" +
                "3.Yuta \n" +
                "4.Jogo \n" +
                "5.Megumi \n" +
                "6.Yuji \n" +
                "7.Toji \n");

        System.out.println("Choose your Character: ");
        int player1 = sc.nextInt();
        System.out.println("Choose your Character: ");
        int player2 = sc.nextInt();

        int damage;

        switch (player1){
            case 1:
                System.out.println("Player 1 : Gojo");
                damage = 100;
                health = 500;

                break;
            case 2:
                System.out.println("Player 1 : Sukuna");
                damage = 85;
                health = 670;
                break;
            case 3:
                System.out.println("Player 1 : Yuta");
                damage = 70;
                health = 430;
                break;
            case 4:
                System.out.println("Player 1 : Jogo");
                damage = 60;
                break;
            case 5:
                System.out.println("Player 1 : Megumi");
                damage = 55;
                break;
            case 6:
                System.out.println("Player 1 : Yuji");
                damage = 55;
                break;
            case 7:
                System.out.println("Player 1 : Toji");
                damage = 100;
                break;
        }
        switch (player2) {
            case 1:
                System.out.println("Player 2 : Gojo");
                damage = 100;
                break;
            case 2:
                System.out.println("Player 2 : Sukuna");
                damage = 85;
                break;
            case 3:
                System.out.println("Player 2 : Yuta");
                damage = 70;
                break;
            case 4:
                System.out.println("Player 2 : Jogo");
                damage = 60;
                break;
            case 5:
                System.out.println("Player 2 : Megumi");
                damage = 55;
                break;
            case 6:
                System.out.println("Player 2 : Yuji");
                damage = 55;
                break;
            case 7:
                System.out.println("Player 2 : Toji");
                damage = 100;
                break;
        }
    }

    public static void attack(){



    }





}
