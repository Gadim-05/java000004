import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieMain {
    public static void main(String[] args) {
        List<MovieStream> movies = new ArrayList<>();
        movies.add(new MovieStream("The Shawshank Redemption", "Drama"));
        movies.add(new MovieStream("Inception", "Sci-Fi"));
        movies.add(new MovieStream("The Dark Knight", "Action"));
        movies.add(new MovieStream("Pulp Fiction", "Crime"));
        movies.add(new MovieStream("Fight Club", "Drama"));
        movies.add(new MovieStream("The Matrix", "Sci-Fi"));
        movies.add(new MovieStream("Goodfellas", "Crime"));

        List<String> uniqueGenres = movies.stream()
                .map(MovieStream::getGenre)
                .distinct()
                .sorted()
                .toList();

        System.out.println("Unique genres in alphabetical order: " + uniqueGenres);
    }
}