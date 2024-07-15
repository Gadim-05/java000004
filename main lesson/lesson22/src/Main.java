import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Qirmizi papaq", "Qedim Qedimli", 6.24,2012);
        Book book1 = new Book("Melikmemmed", "Teymur Abdullayev", 5.46,2012);
        Book book2 = new Book("Cirtdan", "Tebriz Memmedli", 8.21,2005);


        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book);
        books.add(book2);

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o2.getPublicationYear().equals(o1.getPublicationYear()))
                    return o1.getPrice().compareTo(o2.getPrice());
                else {
                    return o1.getPublicationYear().compareTo(o2.getPublicationYear());
                }
            }
        });
        Collections.sort(books);


        for (Book b : books){
            System.out.println(b);
        }

        Student student1 = new Student("Qedim Qedimli", 18,97);
        Student student2 = new Student("Teymur Abdullayev", 19, 83);
        Student student3 = new Student("Tebriz Memmedov", 17, 89);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Student s : students){
            System.out.println(s);
        }


    }
}