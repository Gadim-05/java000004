import java.util.Scanner;

public class QuizGame {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questionText = { "1. Kosmosa uçan ilk insan kimdir?",
                                  "2. Azərbaycanın paytaxtı hansı şəhərdir?",
                                  "3. Mona Lisa tablosunun müəllifi kimdir?",
                                  "4. Xəzər universiteti harada yerləşir?",
                                  "5. Su neçə dərəcədə qaynayır?"};
        String[] answers = {"A. Qədim Qədimli   B. Teymur Abdullayev   C.Yuri Gagarin   D.Abdullah Zoubir",
                            "A. Tərtər   B. Gəncə   C. Göytəpə   D. Bakı",
                            "A. Məhəmməd Füzuli   B. Leonardo Da Vinci   C. Qəzəbli Qartal   D. Elə bir əsər yoxdur",
                            "A. Neftçilər   B. Memar Əcəmi   C. Xəzər dənizi   D. Əfqanıstan",
                            "A. 50   B. 70   C. 0   D.   100"};
//        char[] validAnswer = {'A', 'B', 'C', 'D'};
        int point = 0;

        System.out.println("Welcome to the science quiz! ");
        System.out.println();


        for (int i = 0; i < questionText.length; i++) {
            System.out.println(questionText[i]);
            System.out.println(answers[i]);
            System.out.println();
            System.out.print ("Your answer: ");
            String answer = scanner.next().toUpperCase();

            switch (i){
                case 0:
                    if (answer.equals("C")){
                        System.out.println("Correct!");
                        point++;
                    }
                    else {
                        System.out.println("Wrong!");
                    }
                    break;
                case 1:
                    if (answer.equals("D")){
                        System.out.println("Correct!");
                        point++;
                    }
                    else {
                        System.out.println("Wrong!");
                    }
                    break;
                case 2:
                    if (answer.equals("B")){
                        System.out.println("Correct!");
                        point++;
                    }
                    else {
                        System.out.println("Wrong!");
                    }
                    break;
                case 3:
                    if (answer.equals("A")){
                        System.out.println("Correct!");
                        point++;
                    }
                    else {
                        System.out.println("Wrong!");
                    }
                    break;
                case 4:
                    if (answer.equals("D")){
                        System.out.println("Correct!");
                        point++;
                    }
                    else {
                        System.out.println("Wrong!");
                    }
                    break;

            }

        }
        System.out.println("Your point: " + point);

    }


}
