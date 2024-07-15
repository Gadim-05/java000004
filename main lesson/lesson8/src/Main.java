//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Mercedes";
        car1.model = "E250";
        car1.year = 2020;
        System.out.println("CAR DETAILS: ");
        System.out.println("Car brand: " + car1.brand);
        System.out.println("Car model: " + car1.model);
        System.out.println("Car year: " + car1.year);
        System.out.println();



        Student student1 = new Student();

        student1.name = "Ebdulqadir";
        student1.grade = 78;
        student1.isGraduating = true;

        System.out.println("STUDENT DETAILS: ");
        System.out.println("Student name: " + student1.name);
        System.out.println("Student grade: " + student1.grade);
        System.out.println("Student graduating: " + student1.isGraduating);
        System.out.println();


        Car car2 = new Car();

        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2008;

        boolean oldCar = car2.isOldCar();
        System.out.println("Is car old?");
        System.out.println(oldCar);
        System.out.println();

        Student student2 = new Student();

        student2.name = "Teymur";
        student2.grade = 43;
        student2.isGraduating = student2.isPassing(student2.grade);
        System.out.println("Is student passing?");
        System.out.println(student2.isGraduating);

    }
}