import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();

        System.out.println("Please enter student's name");
        student1.name = scanner.next();

        System.out.println("Please enter student's age");
        student1.age = scanner.nextInt();

        System.out.println("Please enter student's grade");
        student1.grade = scanner.nextInt();

        student1.sout(student1.name, student1.age, student1.grade);

        char girade = student1.isGrade(student1.grade);
        System.out.println(girade);
    }
}
