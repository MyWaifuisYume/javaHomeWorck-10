import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfficheManagerTest {

    @Test
    public void shouldAddMovie() {
        AfficheManager manager = new AfficheManager();

        manager.addMovie("Film A");
        manager.addMovie("Film B");
        manager.addMovie("Film C");

        String[] expected = {"Film A", "Film B", "Film C"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieEmpty() {
        AfficheManager manager = new AfficheManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieBelowLimit() {
        AfficheManager manager = new AfficheManager();

        manager.addMovie("Film A");
        manager.addMovie("Film B");
        manager.addMovie("Film C");
        manager.addMovie("Film D");

        String[] expected = {"Film D", "Film C", "Film B", "Film A"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieOverLimit() {
        AfficheManager manager = new AfficheManager();

        manager.addMovie("Film A");
        manager.addMovie("Film B");
        manager.addMovie("Film C");
        manager.addMovie("Film D");
        manager.addMovie("Film E");
        manager.addMovie("Film F");
        manager.addMovie("Film G");

        String[] expected = {"Film G", "Film F", "Film E", "Film D", "Film C"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
