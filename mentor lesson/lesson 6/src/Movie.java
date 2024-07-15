import java.util.Arrays;

public class Movie {
    String title;

    String genre;

    int releaseYear;

    Actor[] actors;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", actors=" + Arrays.toString(actors) +
                '}';
    }

    public Movie(String title, String genre, int releaseYear, Actor[] actors) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.actors = actors;
    }
}
