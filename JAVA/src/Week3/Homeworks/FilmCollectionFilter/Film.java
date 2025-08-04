package Week3.Homeworks.FilmCollectionFilter;

import java.util.Objects;

public class Film implements Comparable<Film> {

    private String name;
    private int year;
    private String genre;
    private double imdb;

    public Film(int year, String genre, String name, double imdb) {
        this.year = year;
        this.genre = genre;
        this.name = name;
        this.imdb = imdb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public double getImdb() {
        return imdb;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", imdb=" + imdb +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return year == film.year &&
                Double.compare(imdb, film.imdb) == 0 &&
                Objects.equals(name, film.name) &&
                Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, genre, imdb);
    }

    @Override
    public int compareTo(Film other) {
        return Double.compare(other.imdb, this.imdb);
    }
}
