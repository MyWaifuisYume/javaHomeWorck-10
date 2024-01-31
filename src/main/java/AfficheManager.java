public class AfficheManager {
    private String[] movies = new String[0];
    private int limit;

    public AfficheManager() {
        this.limit = 5;

    }

    public AfficheManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int finalLength;
        if (movies.length < limit) {
            finalLength = movies.length;
        } else {
            finalLength = limit;
        }
        String[] tmp = new String[finalLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
