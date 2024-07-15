import java.util.InputMismatchException;
import java.util.Scanner;


public class StudentGrade {

    public static void main(String[] args) throws InvalidGradeException, NumberFormatException{

        Scanner scanner = new Scanner(System.in);

        int grade;
        int sum = 0;
        int max = 0;
        int min = 100;
        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();
        if (count<=0){
            throw new NumberFormatException("Number of students can not be negative!!!!");
        }


        for (int i = 1; i <= count; i++) {
            System.out.print("Enter grade for student " + i + ": ");

            try {
                grade = scanner.nextInt();
                if (grade<0|| grade>100){
                    throw new InvalidGradeException("Grade must be between 0 and 100");
                }
                if (grade>max){
                    max = grade;
                }
                if (grade<min){
                    min = grade;
                }
                sum+=grade;
            }catch (InputMismatchException e){
                System.out.println("Ancaq reqem yazilalidir.");
                return;
            }

        }
        System.out.println("Average grade: " + (sum/count));

        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);
    }


}
