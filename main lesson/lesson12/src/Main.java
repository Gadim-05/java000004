import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Questions question1 = new Questions("1. Kosmosa uçan ilk insan kimdir?","A. Qədim Qədimli   B. Teymur Abdullayev   C.Yuri Gagarin   D.Abdullah Zoubir");
        Questions question2 = new Questions("2. Azərbaycanın paytaxtı hansı şəhərdir?","A. Tərtər   B. Gəncə   C. Göytəpə   D. Bakı");
        Questions question3 = new Questions("3. Mona Lisa tablosunun müəllifi kimdir?","A. Məhəmməd Füzuli   B. Leonardo Da Vinci   C. Qəzəbli Qartal   D. Elə bir əsər yoxdur");
        Questions question4 = new Questions("4. Xəzər universiteti harada yerləşir?","A. Neftçilər   B. Memar Əcəmi   C. Xəzər dənizi   D. Əfqanıstan");
        Questions question5 = new Questions("5. Su neçə dərəcədə qaynayır?","A. 50   B. 70   C. 0   D.100");

        int point = 0;
        String answer;
        System.out.println("Welcome to the science quiz! ");
        System.out.println();
        System.out.println("If you don't know the answer you can skip");
        System.out.println();

        for (int i = 0; i < Questions.questionCount; i++) {
            switch (i) {
                case 0:
                    System.out.println("Question 1: " + question1.getQuestion() + "\n" + "Answers: " + question1.getAnswer());
                    System.out.println();
                    System.out.print ("Your answer: ");
                    answer = scanner.next().toUpperCase();
                    if (answer.equals("C")){
                        System.out.println("Correct!");
                        point++;
                    } else if (answer.equals("skip")) {
                        continue;
                    } else {
                        System.out.println("Wrong!");
                        point--;
                    }
                    break;
                case 1:
                    System.out.println("Question 2: " + question2.getQuestion() + "\n" + "Answers: " + question2.getAnswer());
                    System.out.println();
                    System.out.print ("Your answer: ");
                    answer = scanner.next().toUpperCase();
                    if (answer.equals("D")){
                        System.out.println("Correct!");
                        point+=2;
                    }
                    else if (answer.equals("skip")) {
                        continue;
                    }
                    else {
                        System.out.println("Wrong!");
                        point--;
                    }
                    break;
                case 2:
                    System.out.println("Question 3: " + question3.getQuestion() + "\n" + "Answers: " + question3.getAnswer());
                    System.out.println();
                    System.out.print ("Your answer: ");
                    answer = scanner.next().toUpperCase();
                    if (answer.equals("B")){
                        System.out.println("Correct!");
                        point++;
                    }
                    else if (answer.equals("skip")) {
                        continue;
                    }
                    else {
                        System.out.println("Wrong!");
                        point--;
                    }
                    break;
                case 3:
                    System.out.println("Question 4: " + question4.getQuestion() + "\n" + "Answers: " + question4.getAnswer());
                    System.out.println();
                    System.out.print ("Your answer: ");
                    answer = scanner.next().toUpperCase();
                    if (answer.equals("A")){
                        System.out.println("Correct!");
                        point+=3;
                    }
                    else if (answer.equals("skip")) {
                        continue;
                    }
                    else {
                        System.out.println("Wrong!");
                        point--;
                    }
                    break;
                case 4:
                    System.out.println("Question 5: " + question5.getQuestion() + "\n" + "Answers: " + question5.getAnswer());
                    System.out.println();
                    System.out.print ("Your answer: ");
                    answer = scanner.next().toUpperCase();
                    if (answer.equals("D")){
                        System.out.println("Correct!");
                        point++;
                    }
                    else if (answer.equals("skip")) {
                        continue;
                    }
                    else {
                        System.out.println("Wrong!");
                        point--;
                    }
                    break;
                default:
                    break;
            }
        }


        System.out.println("Your point: " + point);


    }
}