public class Student {
    String name;
    int age;
    int grade;

    public char isGrade(int grade){
        if (grade / 10 == 6) {
            return 'D';
        } else if (grade / 10 == 7) {
            return 'C';
        } else if (grade / 10 == 8) {
            return 'B';
        } else if (grade / 10 == 10 || grade / 10 == 9) {
            return 'A';
        } else {
            return '0';
        }
    }

    public void sout(String name, int age, int grade){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }
}
