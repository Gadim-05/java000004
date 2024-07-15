import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter Month Number: ");
//        int num = scanner.nextInt();
//
//        Example.whichSeason(num);



        //task 2

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        Integer number = Integer.valueOf(userInput);
//
//        double doubledNumber = number.doubleValue()*2;
//
//        System.out.println("The double of the number is: " + doubledNumber);

        //task 3

//        int a = 50;
//        Integer bInt = Integer.valueOf(a);
//        int uInt = bInt.intValue();
//
//        System.out.println("Normal: " + a);
//        System.out.println("Boxed: " + bInt);
//        System.out.println("Unboxed: " + uInt);

        //task 4

//        System.out.print("Enter your age: ");
//        String age = scanner.nextLine();
//        int ageInt= Integer.parseInt(age);
//        int yearsUntil18 = 18 - ageInt;
//
//        if (yearsUntil18 > 0) {
//            System.out.println("You will turn 18 in " + yearsUntil18 + " years.");
//        } else if (yearsUntil18 == 0) {
//            System.out.println("You are 18 years old.");
//        } else {
//            System.out.println("You turned 18 " + Math.abs(yearsUntil18) + " years ago.");
//        }

        //task 5

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String regex = "\\b[Ss]\\w*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("'S' le baslayan sozler: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}