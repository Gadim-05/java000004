//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Robert Downey Jr.", 59);
        Actor actor2 = new Actor("Cillian Murphy", 47);

        Movie movie1 = new Movie("Oppenheimer","Biographic", 2023, new Actor[]{actor1, actor2});
        Movie movie2 = new Movie("Inception", "Science Fiction / Action", 2010, new Actor[]{actor2});
        Movie movie3 = new Movie("Iron Man", "Science Fiction / Action", 2008, new Actor[]{actor1});

        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(movie3);
        System.out.println(movie2);
        System.out.println(movie1);
    }
}