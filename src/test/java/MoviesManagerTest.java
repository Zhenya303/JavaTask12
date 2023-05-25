import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test

    public void test() {

        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
    }

    @Test

    public void FindMovieTest() {

        MovieManager manager = new MovieManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");


        String[] expected = {"film1", "film2", "film3", "film4", "film5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void addFindMovieWithLimitTest() {

        MovieManager manager = new MovieManager(4);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");


        String[] expected = {"film1", "film2", "film3", "film4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");


        String[] expected = {"film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastTestIfLimit3() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");


        String[] expected = {"film6", "film5", "film4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastTestIfLimit6() {
        MovieManager manager = new MovieManager(6);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");


        String[] expected = {"film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findLastTestIfLimit5() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");


        String[] expected = {"film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }
}



