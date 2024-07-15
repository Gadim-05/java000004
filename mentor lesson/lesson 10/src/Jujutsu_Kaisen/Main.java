package Jujutsu_Kaisen;

import java.util.Scanner;

public class Main {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        Character ch = new Character();

        Sorcerer gojo = new Sorcerer("Gojo Satoru", "Six Eyes, Infinity", "Special grade", "Unlimited Void", "Gojo");
        Sorcerer yuji = new Sorcerer("Itadori Yuji", "Blood Manipulation, Shrine", "Unranked", "none", "none");
        Sorcerer toji = new Sorcerer("Toji Fushiguro", "Non-Curse User", "Unranked", "none", "Zenin");
        Sorcerer megumi = new Sorcerer("Megumi Fushiguro", "The Ten Shadows Technique", "Grade 2", "none", "Zenin");
        Sorcerer yuta = new Sorcerer("Yuta Okkotsu", "Copying Techniques", "Special Grade", "All-encompassing Unequivocal Love","Gojo");
        Curse sukuna = new Curse("Ryomen Sukuna (King of Curses)", "Shrine, Dismantle, Cleave", "Special Grade", "Malevolent Shrine", "Light speed");
        Curse jogo = new Curse("Jogo", "Disaster Flames", "Special Grade", "Coffin of The Iron Montain", "sound speed");



        ch.characterChoosing();


        System.out.println("Your move: ");
        String move = sc.nextLine();

        switch (move){
            case "attack":
                ch.attack();

            case "defend":

        }








    }




}
