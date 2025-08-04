package Week3.Homeworks.FilmCollectionFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FilmFilter {

    public static void main(String[] args) {

        ArrayList<Film> films = new ArrayList<>(5);

        films.add(new Film(2020, "korku", "dabbe", 4.4));
        films.add(new Film(2012, "bilim kurgu", "mars", 5.0));
        films.add(new Film(2009, "romantik komedi", "cennet gibi", 8));
        films.add(new Film(2010, "aksiyon", "die hard", 9.1));
        films.add(new Film(2017, "fantastik", "yüzüklerin efendisi", 8.7));

        System.out.println("Tüm Filmler:");
        for (Film film : films) {
            System.out.println(film);
        }

        System.out.println("\nIMDb puanına göre:");
        Collections.sort(films);
        for (Film film : films) {
            System.out.println(film);
        }

        System.out.println("\nYayın yılına göre: ");
        films.sort(Comparator.comparingInt(Film::getYear));
        for (Film film : films) {
            System.out.println(film);
        }

        System.out.println();
        filterByGenre(films, "fantastik");
    }

    public static void filterByGenre(ArrayList<Film> films, String genre) {
        System.out.println("\nTürü '" + genre + "' olan filmler:");
        boolean found = false;
        for (Film film : films) {
            if (film.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("--- " + film.getName() + " | IMDB: " + film.getImdb());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Bu türe ait film listede yok.");
        }
    }
}
