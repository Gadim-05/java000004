public class Student {
    String name;
    int grade;
    boolean isGraduating;

    public boolean isPassing(int grade){
        if (grade>=50){
            return true;
        }
        else {
            return false;
        }
    }
}
